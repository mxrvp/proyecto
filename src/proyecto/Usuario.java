package proyecto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Usuario {

    public static String usuarioInicio;
    private String cedula;
    private String userId; //nombre de usuario de sistema
    private String contrasena;
    private String nombre;
    private String apellido;
    private String direccion;
    private int tipo; // 0 es usuario normal, 1 es admin

    private final String Carpeta = "C:\\archivojavautp\\";
    private final String ArchivoUsuario = "ArchivoUsuario.txt";
    //private final String ArchivoTrabajador = "archivoTrabajador";
    private final String Separador = "|";

    public Usuario() {
    }

    public Usuario(String cedula, String userId, String contrasena, String nombre, String apellido, String direccion, int tipo) {
        this.cedula = cedula;
        this.userId = userId;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.tipo = tipo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public boolean Insertar() {

        File fCarpeta = new File(Carpeta);
        if(!fCarpeta.exists())
            fCarpeta.mkdir();

        try {
            FileWriter fw = new FileWriter(Carpeta + ArchivoUsuario, true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(this.cedula + this.Separador + this.userId + this.Separador
                    + (utilmax.Util_Encrypt.cifrar(this.contrasena))
                    + this.Separador + this.nombre + this.Separador + this.apellido + this.Separador
                    + this.direccion);
            pw.close();
            fw.close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }//fin metodo insertar

    public boolean Modificar() {
        File fCarpeta = new File(Carpeta);
        if (!fCarpeta.exists()) {
            fCarpeta.mkdir();
        }

        File fFile = new File(Carpeta.concat(ArchivoUsuario));

        try {
            FileWriter fFile2 = new FileWriter(Carpeta + ArchivoUsuario + ".tmp");
            PrintWriter pw = new PrintWriter(fFile2);
            try {
                Scanner scanner = new Scanner(fFile);
                while (scanner.hasNextLine()) {
                    String linea = scanner.nextLine();
                    String[] arr = linea.split("\\|");
                    if (arr[0].equals(this.cedula)) //agarra todas las lineas menos la borrada
                    {
                        pw.println(this.cedula + this.Separador + this.userId + this.Separador
                                + (utilmax.Util_Encrypt.cifrar(this.contrasena))
                                + this.Separador + this.nombre + this.Separador
                                + this.apellido + this.Separador + this.direccion);
                    } else {
                        pw.println(linea);
                    }
                }

                pw.close();
                fFile2.close();
                scanner.close();
                fFile.delete();

                File newFile = new File(Carpeta.concat(ArchivoUsuario).concat(".tmp"));
                newFile.renameTo(fFile);
                return true;
            } catch (FileNotFoundException e) {
                return false;
            }
        } catch (IOException e) {
            return false;
        }
    }//fin de modificar

    public boolean Eliminar() {
        File fCarpeta = new File(Carpeta);
        if (!fCarpeta.exists()) {
            fCarpeta.mkdir();
        }

        File fFile = new File(Carpeta.concat(ArchivoUsuario));

        try {
            FileWriter fFile2 = new FileWriter(Carpeta.concat(ArchivoUsuario).concat(".tmp"));
            PrintWriter pw = new PrintWriter(fFile2);
            try {
                Scanner scanner = new Scanner(fFile);
                while (scanner.hasNextLine()) {
                    String linea = scanner.nextLine();
                    String[] arr = linea.split("\\|");
                    if (!arr[0].equals(cedula)) //agarra todas las lineas menos la borrada
                    {
                        pw.println(linea);
                    }

                }

                pw.close();
                scanner.close();
                fFile2.close();

                //Eliminando el viejo
                if (fFile.delete()) {
                    System.out.println("El fichero ha sido borrado satisfactoriamente");
                } else {
                    System.out.println("El fichero no puede ser borrado");
                }
                File newFile = new File(Carpeta.concat(ArchivoUsuario).concat(".tmp"));
                newFile.renameTo(fFile);

                return true;
            } catch (FileNotFoundException e) {
                return false;
            }
        } catch (IOException e) {
            return false;
        }
    }//fin metodo Eliminar

    public boolean UsuarioRepetido(String usuario) {
        boolean confirmacion = false;
        File fFile = new File(Carpeta + ArchivoUsuario);
        String arr[] = new String[6];
        try {
            Scanner scanner = new Scanner(fFile);
            if(scanner.hasNext()){
            
              while (scanner.hasNextLine()) {

                String linea = scanner.nextLine();
                arr = linea.split("\\|");
             
               System.out.println(arr.length);
                Usuario obj = new Usuario();
                obj.setCedula(arr[0]);
                obj.setUserId(arr[1]);
                obj.setContrasena(arr[2]);
                obj.setNombre(arr[3]);
                obj.setApellido(arr[4]);
                obj.setDireccion(arr[5]);
            if (arr[1].equals(usuario)) {
                    confirmacion = true;
                }
                
            }//fin del while}
            }
            scanner.close();
        } catch (FileNotFoundException e) {
              e.getMessage();
        }
        return confirmacion;
    }// fin metodo usuario repetido

    public boolean ValidarUsuario() {
        File fCarpeta = new File(Carpeta);
        if (!fCarpeta.exists()) {
            fCarpeta.mkdir();
        }

        File fFile = new File(Carpeta + ArchivoUsuario);

        try {
            Scanner scanner = new Scanner(fFile);
            if(scanner.hasNext()){
                  while (scanner.hasNextLine()) {
                String[] linea = scanner.nextLine().split("\\|");
                if (linea[1].equals(this.userId) && (linea[2].equals(utilmax.Util_Encrypt.cifrar(this.contrasena)))) {
                    usuarioInicio = linea[3].concat(" ").concat(linea[4]);
                    scanner.close();

                    return true;
                }
            }
          
            }
            scanner.close();

            return false;
        } catch (FileNotFoundException e) {
            return false;
        }
    }//fin metodo ValidarUsuario
}//fin de la clase Usuario
