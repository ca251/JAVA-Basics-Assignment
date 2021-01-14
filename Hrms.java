import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File; import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.FileReader;
import java.io.*;

public class Hrms{
   public static void main(String[] args)throws FileNotFoundException,IOException{
     /* File txt = new File("employee2.txt");
      BufferedReader br = new BufferedReader(new FileReader(txt));
      String st = br.readLine();
      Ceo ceo = new Ceo();
      
      while((st=br.readLine())!=null){
         StringTokenizer stn = new StringTokenizer(st,";");   
         ceo.setFirstName(stn.nextToken(";"));
         ceo.setLastName(stn.nextToken(";"));
         ceo.setId(stn.nextToken(";"));
         ceo.setDateOfBirth(stn.nextToken(";"));
         ceo.setGender(stn.nextToken(";"));
         ceo.setAdress(stn.nextToken(";"));
         ceo.setTitleOfEmployment(stn.nextToken(";"));
         ceo.setDateHired(stn.nextToken(";"));
         ceo.setDepartment(stn.nextToken(";"));
         ceo.setHoursWorked(Integer.parseInt(stn.nextToken(";")));
         ceo.setRateOfPay(Double.parseDouble(stn.nextToken(";")));
         ceo.setLeaveDays(Integer.parseInt(stn.nextToken(";")))  ; 
         ceo.setCarAllowance(Double.parseDouble(stn.nextToken(";"))); 
         ceo.setMonthlyGratuity(Integer.parseInt(stn.nextToken(";")));
         ceo.setTaxRate(Double.parseDouble(stn.nextToken(";")));
         
         if(ceo.getTitleOfEmployment().equalsIgnoreCase("ceo")){
            System.out.println(ceo.getFirstName()+"  "+ ceo.getTaxAmount());
           
         }
         
      }*/
         marketingExecutives();

   }
   public static void marketingExecutives()throws FileNotFoundException,IOException{
      File txt = new File("employee2.txt");
      BufferedReader br = new BufferedReader(new FileReader(txt));
      String st = br.readLine();
      MarketingExecutives marketing = new MarketingExecutives();
      
      while((st=br.readLine())!=null){
         StringTokenizer stn = new StringTokenizer(st,";");   
         marketing.setFirstName(stn.nextToken(";"));
         marketing.setLastName(stn.nextToken(";"));
         marketing.setId(stn.nextToken(";"));
         marketing.setDateOfBirth(stn.nextToken(";"));
         marketing.setGender(stn.nextToken(";"));
         marketing.setAdress(stn.nextToken(";"));
         marketing.setTitleOfEmployment(stn.nextToken(";"));
         marketing.setDateHired(stn.nextToken(";"));
         marketing.setDepartment(stn.nextToken(";"));
         marketing.setHoursWorked(Integer.parseInt(stn.nextToken(";")));
         marketing.setRateOfPay(Double.parseDouble(stn.nextToken(";")));
         marketing.setLeaveDays(Integer.parseInt(stn.nextToken(";")))  ; 
         marketing.setCarAllowance(Double.parseDouble(stn.nextToken(";"))); 
         marketing.setMonthlyGratuity(Integer.parseInt(stn.nextToken(";")));
         marketing.setTaxRate(Double.parseDouble(stn.nextToken(";")));
         
         if(marketing.getTitleOfEmployment().equalsIgnoreCase("marketing-executive")){
            System.out.println(marketing.getFirstName()+"  "+ marketing.getTaxAmount());
         }
      }

   
   }
   public static void tourGuides()throws FileNotFoundException,IOException{
      File txt = new File("employee2.txt");
      BufferedReader br = new BufferedReader(new FileReader(txt));
      String st = br.readLine();
      TourGuides tour = new TourGuides();
      
      while((st=br.readLine())!=null){
         StringTokenizer stn = new StringTokenizer(st,";");   
         tour.setFirstName(stn.nextToken(";"));
         tour.setLastName(stn.nextToken(";"));
         tour.setId(stn.nextToken(";"));
         tour.setDateOfBirth(stn.nextToken(";"));
         tour.setGender(stn.nextToken(";"));
         tour.setAdress(stn.nextToken(";"));
         tour.setTitleOfEmployment(stn.nextToken(";"));
         tour.setDateHired(stn.nextToken(";"));
         tour.setDepartment(stn.nextToken(";"));
         tour.setHoursWorked(Integer.parseInt(stn.nextToken(";")));
         tour.setRateOfPay(Double.parseDouble(stn.nextToken(";")));
         tour.setLeaveDays(Integer.parseInt(stn.nextToken(";")))  ; 
         tour.setCarAllowance(Double.parseDouble(stn.nextToken(";"))); 
         tour.setMonthlyGratuity(Integer.parseInt(stn.nextToken(";")));
         tour.setTaxRate(Double.parseDouble(stn.nextToken(";")));
         
         if(tour.getTitleOfEmployment().equalsIgnoreCase("tourOperator")){
            System.out.println(tour.getFirstName()+"  "+ tour.getTaxAmount());
         }
      }

   
   }

   
}