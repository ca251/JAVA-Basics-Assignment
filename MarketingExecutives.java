public class MarketingExecutives extends Employee{
  /* private double rateOfPay;
   private int hoursWorked;
   private double monthlyGratuity;
   private float taxRate;*/
   double taxAmount;
   double grossSalary;
   double netSalary;
   double carAllowance;
   public MarketingExecutives(){
   }
  public MarketingExecutives(double carAllowance){
   }
      public double getCarAllowance() {
      return carAllowance;
   }

   public void setCarAllowance(double carAllowance) {
      this.carAllowance = carAllowance;
   
   }

   public double getSalary(){
      double grossSalary = (rateOfPay*hoursWorked)+monthlyGratuity;
      return grossSalary; 
   }
   public double getNetSalary(){
         double grossSalary = (rateOfPay*hoursWorked)+monthlyGratuity;
         double taxAmount = taxRate * grossSalary; 
         double netSalary = grossSalary-taxAmount;
         return netSalary;

   }
   public double getTaxAmount(){
         double grossSalary = (rateOfPay*hoursWorked)+monthlyGratuity;
         double taxAmount = taxRate * grossSalary;
         return taxAmount;
   
}
}  