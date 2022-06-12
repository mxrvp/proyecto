/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author admin
 */
public class Empleado {
    private int numEmpleado;
    private String nombre;
    private int sueldo;

    public Empleado(int numEmpleado, String nombre, int sueldo) {
        this.numEmpleado = numEmpleado;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getNumEmpleado() {
        return this.numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
    public void  aumentarSueldo(int porcentaje){
      this.sueldo+=this.sueldo*porcentaje;
       
    }
    
    
}
