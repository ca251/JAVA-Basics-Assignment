 public abstract class Employee {
   String firstName;
   String lastName;
   String id;
   String gender;
   String adress;
   String dateOfBirth;
   String titleOfEmployment;
   String dateHired;
   String department;
   int hoursWorked;
   double rateOfPay;
   int leaveDays;
   double monthlyGratuity;
   double taxRate;
   double salary;

   public Employee() {
   
   }
   public Employee(String firstName, String lastName, String id, String dateOfBirth, String gender, String adress, String titleOfEmployment, String dateHired, String department, int hoursWorked, double rateOfPay, int leaveDays, double monthlyGratuity, double taxRate){}
     
   public String getTitleOfEmployment() {
      return titleOfEmployment;
   }

   public void setTitleOfEmployment(String titleOfEmployment) {
      this.titleOfEmployment = titleOfEmployment;
   }

   public String getDateHired() {
      return dateHired;
   }

   public void setDateHired(String dateHired) {
      this.dateHired = dateHired;
   }

   public String getDepartment() {
      return department;
   }

   public void setDepartment(String department) {
      this.department = department;
   }

   public int getHoursWorked() {
      return hoursWorked;
   }

   public void setHoursWorked(int hoursWorked) {
      this.hoursWorked = hoursWorked;
   }

   public double getRateOfPay() {
      return rateOfPay;
   }

   public void setRateOfPay(double rateOfPay) {
      this.rateOfPay = rateOfPay;
   }

   public int getLeaveDays() {
      return leaveDays;
   }

   public void setLeaveDays(int leaveDays) {
      this.leaveDays = leaveDays;
   }

   public double getMonthlyGratuity() {
      return monthlyGratuity;
   }

   public void setMonthlyGratuity(double monthlyGratuity) {
      this.monthlyGratuity = monthlyGratuity;
   }

   public double getTaxRate() {
      return taxRate;
   }

   public void setTaxRate(double taxRate) {
      this.taxRate = taxRate;
   }

   public double getSalary() {
      return salary;
   }

   public void setSalary(double salary) {
      this.salary = salary;
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getGender() {
      return gender;
   }

   public void setGender(String gender) {
      this.gender = gender;
   }

   public String getAdress() {
      return adress;
   }

   public void setAdress(String adress) {
      this.adress = adress;
   }

   public String getDateOfBirth() {
      return dateOfBirth;
   }

   public void setDateOfBirth(String dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

  
       
}
