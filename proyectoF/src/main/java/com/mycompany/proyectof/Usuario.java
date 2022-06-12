/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectof;

/**
 *
 * @author efrai
 */
public class Usuario {
    private String cedula;
    private int userld;
    private String contrasena;
    private String nombre;
    private String apellido;
    private String direccion;
    private int tipo; // 0 es usuario normal, 1 es admin
    
    private final String Carpeta = "definir"; //hay que ver como es
    private final String ArchivoUsuario = "archivoUsuario.txt";
    private final String ArchivoTrabajador = "archivoTrabajador";
    private final String Separador = "|";
    
    public Usuario(){};

    public Usuario(String cedula, int userld, String contrasena, String nombre, String apellido, String direccion, int tipo) {
        this.cedula = cedula;
        this.userld = userld;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.tipo = tipo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getUserld() {
        return userld;
    }

    public void setUserld(int userld) {
        this.userld = userld;
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
    
    
}
