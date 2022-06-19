/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package planilla;

import empleados.Empleado;

/**
 *
 * @author admin
 */
public class EmpPlanilla {
      private Empleado em;
      //horas trabajadas
      private double HT;
      //salario por hora
      private double SxH;
     
      private double SalarioBruto;
     //seguro social
      private double SS;
      //seguro educativo
      private double SE;
      private double SalarioNeto;

    public EmpPlanilla() {
    }

    public EmpPlanilla(Empleado em, double HT, double SxH, double SalarioBruto, double SS, double SE, double salarioNeto) {
        this.em = em;
        this.HT = HT;
        this.SxH = SxH;
        this.SalarioBruto = SalarioBruto;
        this.SS = SS;
        this.SE = SE;
        this.SalarioNeto = salarioNeto;
    }

   public Empleado getEmp(){
         return this.em;  
    }
   
   public double calcularSalarioBruto(){
   
        this.SalarioBruto=this.HT*SxH;
        return this.SalarioBruto;
   }
   
   public double calcularSS(){
     
       this.SS=this.SalarioBruto*9.75/100;
       return this.SS;
   }
   public double calcularSE(){
      
       this.SE=this.SalarioBruto*1.25/100;
        
       return this.SE;
       
   
   }
   
   public double calcularSalarioNeto(){
       
       this.SalarioNeto=this.SalarioBruto-this.SS;
       this.SalarioNeto-=this.SE;
       return this.SalarioNeto;
   }
      
}
