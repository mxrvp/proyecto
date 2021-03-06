package planilla;

import empleados.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PlanillaModel {

    public int queryType;
    private String path = "C:\\archivojavautp\\planilla.txt";
    private String delimiter = "|";
    private File db = new File(path);
    private FileWriter fw;
    private PrintWriter pw;
    private EmpleadosModel emMod;

    private ArrayList<EmpPlanilla> empleados = new ArrayList<EmpPlanilla>();

    //insert
    public PlanillaModel() {
        this.emMod = new EmpleadosModel();
        if (!db.exists()) {
            try {
                db.createNewFile();
            } catch (IOException e) {
                e.getMessage();
            }
        }
        //inicializar lector
        this.refreshModel();

    }

    public boolean insertar(EmpPlanilla em) {

        if (!this.empleados.add(em)) {
            return false;
        }

        try {
            fw = new FileWriter(path, true);
            pw = new PrintWriter(fw);

            pw.println(em.getEmp().getCedula() + delimiter + em.getEmp().getNombre() + delimiter + em.getEmp().getNombre2() + delimiter + em.getEmp().getApellido() + delimiter + em.getEmp().getApellido2() + delimiter + em.getEmp().getHorasTrabajadas() + delimiter + em.getEmp().getSalarioHora() + delimiter + em.calcularSalarioBruto() + delimiter + em.calcularSS() + delimiter + em.calcularSE() + delimiter + em.calcularSalarioNeto());

            fw.close();
        } catch (IOException e) {
            e.getMessage();
        }

        return true;
    }

    public ArrayList<EmpPlanilla> mostrar_todos() {
        return this.empleados;
    }

    public boolean eliminar(int index) {
        //todo del insert 
        //mediante el index borrar del txt
        //overwrite del archivo con los registros actualizados
        this.empleados.remove(index);
        this.refreshFile();

        return true;
    }

    public int getNumEmpleados() {
        return this.empleados.size();
    }

    public boolean cedulaUnica(String ced) {
        String cedula = ced.trim();
        for (int i = 0; i <= this.getNumEmpleados() - 1; i++) {
            EmpPlanilla em = this.empleados.get(i);

            if (em.getEmp().getCedula().equals(cedula)) {
                return false;
            }

        }

        return true;

    }
    //busca el empleado en el arraylist de empleados pero por cedula obtenida del archivo de planilla

    public Empleado buscarCedula(String ced) {
        String cedula = ced.trim();

        Empleado em = null;
        for (int i = 0; i <= this.emMod.getNumEmpleados() - 1; i++) {
            em = this.emMod.buscarEmpleado(i);
            // System.out.println(em.getCedula());
            if (em.getCedula().equals(cedula)) {
                return em;
            }

        }

        return em;
    }

    public int getQueryType() {
        return this.queryType;
    }

    public void setQueryType(int queryType) {
        this.queryType = queryType;
    }

    public void refreshFile() {

        try {
            fw = new FileWriter(path);
            pw = new PrintWriter(fw);

            for (int i = 0; i <= this.empleados.size() - 1; i++) {
                EmpPlanilla em = this.empleados.get(i);
                pw.println(em.getEmp().getCedula() + delimiter + em.getEmp().getNombre() + delimiter + em.getEmp().getNombre2() + delimiter + em.getEmp().getApellido() + delimiter + em.getEmp().getApellido2() + delimiter + em.getEmp().getHorasTrabajadas() + delimiter + em.getEmp().getSalarioHora() + delimiter + em.calcularSalarioBruto() + delimiter + em.calcularSS() + delimiter + em.calcularSE() + delimiter + em.calcularSalarioNeto());

            }

            fw.close();
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public void refreshModel() {
        try {

            Scanner lector = new Scanner(db);
            if (lector.hasNext()) {

                while (lector.hasNextLine()) {
                    String row[] = lector.nextLine().split("\\|");
                    //this.lastId=Integer.parseInt(row[0]);

                    Empleado em = this.buscarCedula(row[0]);
                    em.setHorasTrabajadas(Double.parseDouble(row[5]));
                    em.setSalarioHora(Double.parseDouble(row[6]));

                    this.empleados.add(new EmpPlanilla(em));

                }

            }
            lector.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

}
