public class Drivers extends Employee{
   private double carAllowance;
   private double taxAmount;
   private double grossSalary;
   private double z;
   private double netSalary;
     public Drivers(){
   }
   public Drivers(double carAllowance){}
      public double getCarAllowance() {
      return carAllowance;
   }

   public void setCarAllowance(double carAllowance) {
      this.carAllowance = carAllowance;
   
   }

   public double getSalary(){
      z = (getRateOfPay() * getHoursWorked())+getMonthlyGratuity();
      grossSalary = (getCarAllowance()*z);
      grossSalary = grossSalary + z;
      return grossSalary; 
   }
   public double getNetSalary(){
      z= (getRateOfPay() * getHoursWorked())+getMonthlyGratuity();
      grossSalary = (getCarAllowance()*z);
      grossSalary = grossSalary + z;
      taxAmount= getTaxRate() * grossSalary;
      netSalary = grossSalary-taxAmount;
   
      return netSalary; 
   
   }
   public double getTaxAmount(){
      z = (getRateOfPay() * getHoursWorked())+getMonthlyGratuity();
      grossSalary = (getCarAllowance()*z);
      grossSalary = grossSalary + z;
      taxAmount= getTaxRate() * grossSalary;
      return taxAmount;  
   }
}