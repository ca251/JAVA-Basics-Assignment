public class Sales extends Employee{
   private double carAllowance;
   private double taxAmount;
   private double grossSalary;
   private double c;
   private double netSalary;

   public Sales(){
   }
   public Sales(double carAllowance){}
   public double getCarAllowance() {
      return carAllowance;
   }

   public void setCarAllowance(double carAllowance) {
      this.carAllowance = carAllowance;
   
   }

   public double getSalary(){
      c = (getRateOfPay() * getHoursWorked())+getMonthlyGratuity();
      grossSalary = (getCarAllowance()*c);
      grossSalary = grossSalary + c;
      return grossSalary; 
   }
   public double getNetSalary(){
      c= (getRateOfPay() * getHoursWorked())+getMonthlyGratuity();
      grossSalary = (getCarAllowance()*c);
      grossSalary = grossSalary + c;
      taxAmount= getTaxRate() * grossSalary;
      netSalary = grossSalary-taxAmount;
   
      return netSalary; 
   
   }
   public double getTaxAmount(){
      c = (getRateOfPay() * getHoursWorked())+getMonthlyGratuity();
      grossSalary = (getCarAllowance()*c);
      grossSalary = grossSalary + c;
      taxAmount= getTaxRate() * grossSalary;
      return taxAmount;  
   }
}