/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package planilla;

import empleados.Empleado;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class planillaModel {
     public int queryType;
    private int lastId;
    private String path="C:\\Users\\admin\\Documents\\NetBeansProjects\\proyecto\\src\\planilla\\planilla.txt";
    private String delimiter="|";
    private File db=new File(path);
    private FileWriter fw;
    private PrintWriter pw;
    private Scanner lc;
    
     private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    
}
