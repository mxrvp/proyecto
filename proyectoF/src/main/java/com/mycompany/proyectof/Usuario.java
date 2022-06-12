/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectof;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author efrai
 */
public class Usuario {
    private String cedula;
    private int userld; //conteo
    private String contrasena;
    private String nombre;
    private String apellido;
    private String direccion;
    private int tipo; // 0 es usuario normal, 1 es admin
    
    private final String Carpeta = "\\C:\\Users\\efrai\\OneDrive\\Documents\\NetBeansProjects\\proyectoF\\proyectoF\\src\\main\\java\\com\\mycompany\\proyectof\\"; // Intentare colocar el archivo en la misma carpeta de la clase
    private final String ArchivoUsuario = "ArchivoUsuario.txt";
    //private final String ArchivoTrabajador = "archivoTrabajador";
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
    
    public boolean Insertar(){
        File fCarpeta = new File(Carpeta);
        /*if(!fCarpeta.exists())
            fCarpeta.mkdir();*/
        
        try{
            FileWriter fw = new FileWriter(Carpeta + ArchivoUsuario, true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(this.cedula + this.Separador + this.userld + this.Separador + this.contrasena + this.Separador + this.nombre + this.Separador + this.apellido + this.Separador + this.direccion);
            pw.close();
            fw.close();
            return true;
        }catch(IOException e){
            return false;
        }  
    }//fin metodo insertar
    
     public boolean Modificar(){
        File fCarpeta = new File(Carpeta);
        if(!fCarpeta.exists())
            fCarpeta.mkdir();
        
        File fFile = new File(Carpeta.concat(ArchivoUsuario));
                    
        try{
            FileWriter fFile2 = new FileWriter (Carpeta + ArchivoUsuario + ".tmp"); 
            PrintWriter pw = new PrintWriter(fFile2);
            try{
                Scanner scanner = new Scanner(fFile);
                while(scanner.hasNextLine() ){
                    String linea = scanner.nextLine();
                    String []arr = linea.split("\\|");
                    if(arr[0].equals(this.cedula)) //agarra todas las lineas menos la borrada
                        pw.println(this.cedula + this.Separador + this.userld + this.Separador + this.contrasena + this.Separador + this.nombre + this.Separador + this.apellido + this.Separador + this.direccion);
                    else
                        pw.println(linea);
                }
                
                pw.close();
                fFile2.close();
                scanner.close();
                fFile.delete();  
           
                File newFile = new File(Carpeta.concat(ArchivoUsuario).concat(".tmp"));
                newFile.renameTo(fFile);
                return true;
            }catch(FileNotFoundException e){
                return false;
            }
        }catch(IOException e){
            return false;
        }
    }//fin de modificar
     
     public boolean Eliminar(){
       File fCarpeta = new File(Carpeta);
        if(!fCarpeta.exists())
            fCarpeta.mkdir();
        
        File fFile = new File(Carpeta.concat(ArchivoUsuario));
                    
        try{
            FileWriter fFile2 = new FileWriter ( Carpeta.concat(ArchivoUsuario).concat(".tmp") ); 
            PrintWriter pw = new PrintWriter(fFile2);
            try{
                Scanner scanner = new Scanner(fFile);
                while(scanner.hasNextLine() ){
                    String linea = scanner.nextLine();
                    String []arr = linea.split("\\|");
                    if(!arr[0].equals(cedula)) //agarra todas las lineas menos la borrada
                        pw.println(linea);
                        
                }
                
                pw.close();
                scanner.close();
                fFile2.close();
               
                //Eliminando el viejo
                if (fFile.delete())
                    System.out.println("El fichero ha sido borrado satisfactoriamente");
                else
                    System.out.println("El fichero no puede ser borrado");
                File newFile = new File(Carpeta.concat(ArchivoUsuario).concat(".tmp"));
                newFile.renameTo(fFile);
               
                return true;
            }catch(FileNotFoundException e){
                return false;
            }
        }catch(IOException e){
            return false;
        }
    }//fin metodo Eliminar
     
}//fin de la clase Usuario
