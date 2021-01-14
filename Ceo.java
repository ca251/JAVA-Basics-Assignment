import java.io.FileNotFoundException;
import java.util.Scanner;
public class Ceo extends Employee{
   private double carAllowance;
   private double taxAmount;
   private double grossSalary;
   private double t;
   private double netSalary;
  
   public Ceo(){
   }
   public Ceo(double carAllowance){
   }
  
   public double getCarAllowance() {
      return carAllowance;
   }

   public void setCarAllowance(double carAllowance) {
      this.carAllowance = carAllowance;
   
   }
   public double getSalary(){
      t = (getRateOfPay() * getHoursWorked())+getMonthlyGratuity();
      grossSalary = (getCarAllowance()*t);
      grossSalary = grossSalary + t;
      return grossSalary; 
   }
   public double getNetSalary(){
      t = (getRateOfPay() * getHoursWorked())+getMonthlyGratuity();
      grossSalary = (getCarAllowance()*t);
      grossSalary = grossSalary + t;
      taxAmount= getTaxRate() * grossSalary;
      netSalary = grossSalary-taxAmount;
   
      return netSalary; 
   
   }
   public double getTaxAmount(){
      t = (getRateOfPay() * getHoursWorked())+getMonthlyGratuity();
      grossSalary = (getCarAllowance()*t);
      grossSalary = grossSalary + t;
      taxAmount= getTaxRate() * grossSalary;
      return taxAmount;  
   }
         
   
}
   
         
