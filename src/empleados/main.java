/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author admin
 */
public class main {
    
     public static void main(String[] args) throws ParseException
    {
         Date fechaAct=new Date();
          
         EmpleadosModel m=new EmpleadosModel();
        Empleado emp=new Empleado("8-940-1121", "Abril", "Camaño", "chacon", "ortega",fechaAct , "el Carrizal", "68236059",20,5.00);
         m.insertar(emp);
         
      ArrayList<Empleado> existentes=m.mostrar_todos();
         
       for(int i=0;i<=existentes.size()-1;i++){
             System.out.println(existentes.get(i).getNombre());
         }
        
       Empleado empleado=existentes.get(0);
        System.out.println(empleado.getNombre());
        
        //para 
         
        m.modificar(0, "charles", "albert", "Leclerc", "monaco",new Date(), "Monaco", "68234567",30,10.00);
           
    }
     
     
     
    
}
