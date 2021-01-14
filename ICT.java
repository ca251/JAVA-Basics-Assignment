public class ICT extends Employee{
   private double carAllowance;
  
   private double taxAmount;
   private double grossSalary;
   private double a;
   private double netSalary;
   public ICT(){
   }
   public ICT(double carAllowance){
    }
   public double getCarAllowance() {
      return carAllowance;
   }

   public void setCarAllowance(double carAllowance) {
      this.carAllowance = carAllowance;
   
   }
   public double getSalary(){
      a = (getRateOfPay() * getHoursWorked())+getMonthlyGratuity();
      grossSalary = (getCarAllowance()*a);
      grossSalary = grossSalary + a;
      return grossSalary; 
   }
   public double getNetSalary(){
      a = (getRateOfPay() * getHoursWorked())+getMonthlyGratuity();
      grossSalary = (getCarAllowance()*a);
      grossSalary = grossSalary + a;
      taxAmount= getTaxRate() * grossSalary;
      netSalary = grossSalary-taxAmount;
   
      return netSalary; 
   
   }
   public double getTaxAmount(){
      a = (getRateOfPay() * getHoursWorked())+getMonthlyGratuity();
      grossSalary = (getCarAllowance()*a);
      grossSalary = grossSalary + a;
      taxAmount= getTaxRate() * grossSalary;
      return taxAmount;  
   }
         
   
}