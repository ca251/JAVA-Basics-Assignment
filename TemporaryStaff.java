public class TemporaryStaff extends Employee{
   private double carAllowance;
   private double b;
   private double grossSalary;
   private double taxAmount;
   private double netSalary;
   
   public TemporaryStaff(){
   }
   public TemporaryStaff(double carAllowance){
    
   }
    public double getCarAllowance() {
      return carAllowance;
   }

   public void setCarAllowance(double carAllowance) {
      this.carAllowance = carAllowance;
   
   }

   public double getSalary(){
      b = (getRateOfPay() * getHoursWorked())+getMonthlyGratuity();
      grossSalary = (getCarAllowance()*b);
      grossSalary = grossSalary + b;
      return grossSalary; 
   }
   public double getNetSalary(){
      b = (getRateOfPay() * getHoursWorked())+getMonthlyGratuity();
      grossSalary = (getCarAllowance()*b);
      grossSalary = grossSalary + b;
      taxAmount= getTaxRate() * grossSalary;
      netSalary = grossSalary-taxAmount;
   
      return netSalary; 
   
   }
   public double getTaxAmount(){
      b = (getRateOfPay() * getHoursWorked())+getMonthlyGratuity();
      grossSalary = (getCarAllowance()*b);
       grossSalary = grossSalary + b;
      taxAmount= getTaxRate() * grossSalary;
      return taxAmount;  
   }
         
   
}