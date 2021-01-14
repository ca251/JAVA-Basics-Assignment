import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*; 
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.File; 
import java.io.BufferedReader;
import java.io.FileReader;


public class Gui extends Application implements EventHandler<ActionEvent> {

   Button press, cancel,sch,salary,netSalary,ceo,marketingExecutives,drivers,temporaryStaff,sales,ict,tourGuides,females;
   Label list,search,Firstname,LastName,Id,HoursWorked,Address,Taxrate,RateOfPay,LeaveDays,MonthlyGratuity,CarAllowance,Gender,TitleOfEmployment,Department,DateHired,DateOfBirth;
   TextField field;
   TextArea textArea;

   public static void main(String[] args) {
   
      launch(args);
   }


   @Override
    public void start(Stage primaryStage) throws Exception {
     // Create a ScrollPane
      ScrollPane scrollPane = new ScrollPane();
        
      primaryStage.setTitle("Human Resource Management System");
      press = new Button("employeeList");
      press.setPrefSize(100, 50);
      press.setOnAction(this);
        
      sch = new Button("search");
      sch.setOnAction(this);
        
      salary= new Button("salary");
      salary.setPrefSize(100, 50);
      salary.setOnAction(this);
        
      females= new Button("Females");
      females.setPrefSize(100, 50);
      females.setOnAction(this);
        
      ceo = new Button("CEO");
      ceo.setPrefSize(100, 50);
      ceo.setOnAction(this);
       
      drivers = new Button("Drivers");
      drivers.setPrefSize(100, 50);
      drivers.setOnAction(this);
        
      temporaryStaff = new Button("TemporaryStaff");
      temporaryStaff.setPrefSize(100, 50);
      temporaryStaff.setOnAction(this);
        
      marketingExecutives = new Button("MarketingExec");
      marketingExecutives.setPrefSize(100, 50);
      marketingExecutives.setOnAction(this);
        
      ict = new Button("ICT");
      ict.setPrefSize(100, 50);
      ict.setOnAction(this);
        
      sales = new Button("Sales");
      sales.setPrefSize(100, 50);
      sales.setOnAction(this);
        
      tourGuides = new Button("TourGuides");
      tourGuides.setPrefSize(100, 50);
      tourGuides.setOnAction(this);
   
      netSalary= new Button("netsalary");
      netSalary.setPrefSize(100, 50);
      netSalary.setOnAction(this);
        
      cancel = new Button("back");
      cancel.setPrefSize(100, 50);
      cancel.setOnAction(this);
        
      list = new Label("Employee Details ");
      Firstname = new Label("Fistame:");
      LastName = new Label("Lastame:");
      Id = new Label("Id");
      search = new Label("Search");
       
      field = new TextField();
      textArea = new TextArea();
      textArea.setPrefSize(600,450);
   
   
      GridPane layout = new GridPane();
      
      layout.add(textArea, 1,11);
       
       VBox lay = new VBox(layout);
       lay.getChildren().addAll(press, cancel,salary,netSalary,ceo,marketingExecutives,drivers,temporaryStaff,sales,ict,tourGuides,females);
   
        
       
         // Set content for ScrollPane
      scrollPane.setContent(lay);
    // scrollPane.setContent(lay);
      Scene scene = new Scene(scrollPane,750, 550,Color.WHITESMOKE);
       
      primaryStage.setScene(scene);
      primaryStage.show();
        }


   @Override
    public void handle(ActionEvent e) {
      if (e.getSource() == press) {
            //creating File instance to reference text file in Java
         File text = new File("employee2.txt");
      
            //list = new Label("Employee List ");
            //Creating Scanner instance to read File in Java
         Scanner scanner = null;
      
            /* wrap the scanner object withing try catch statement for possible file not found exception*/
         try {
            scanner = new Scanner(text);
         } catch (FileNotFoundException ex) {
            ex.printStackTrace();
         }
      
         StringTokenizer stringTokenizer;
      
            //Reading each line of file using Scanner class
            //int lineNumber = 1;
         while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
         
            stringTokenizer = new StringTokenizer(line, ";");
         
            textArea.setText(textArea.getText() + "\n" + stringTokenizer.nextToken() + "\t\t\t" + stringTokenizer.nextToken() + "\t\t" + stringTokenizer.nextToken()+ "\t\t" + stringTokenizer.nextToken()+ "\t\t" + stringTokenizer.nextToken()+ "\t\t" + stringTokenizer.nextToken()+ "\t\t" + stringTokenizer.nextToken()+ "\t\t" + stringTokenizer.nextToken()+ "\t\t" + stringTokenizer.nextToken()+ "\t\t" + stringTokenizer.nextToken()+ "\t\t" + stringTokenizer.nextToken()+ "\t\t" + stringTokenizer.nextToken()+ "\t\t" + stringTokenizer.nextToken());
          
         
         }
      } else
         textArea.setText("Employee ");
         //salary button
      if (e.getSource() == salary) {
       
         File txt = new File("employee2.txt");
         Scanner scanner = null;
      
         try {
            scanner = new Scanner(txt);
         
         }catch (FileNotFoundException ex) {
            ex.printStackTrace();
         }
      
      //String st = br.readLine();
         Ceo ceo = new Ceo();
      
         while(scanner.hasNextLine()){
            String line = scanner.nextLine();
         
            StringTokenizer stn = new StringTokenizer(line,";");   
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
               textArea.setText(textArea.getText() + "\n"+ceo.getFirstName()+"  "+ ceo.getTaxAmount()+"  "+ ceo.getSalary());
            }
         }
      } //maketing button
      else if(e.getSource() == marketingExecutives) {
       
         File txt = new File("employee2.txt");
         Scanner scanner = null;
      
         try {
            scanner = new Scanner(txt);
         
         }catch (FileNotFoundException ex) {
            ex.printStackTrace();
         }
      
      //String st = br.readLine();
         MarketingExecutives marketing = new MarketingExecutives();
      
         while(scanner.hasNextLine()){
            String line = scanner.nextLine();
         
            StringTokenizer stn = new StringTokenizer(line,";");   
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
               textArea.setText(textArea.getText() + "\n"+marketing.getFirstName()+"  "+ marketing.getTaxAmount()+"  "+ marketing.getSalary());
            }
         }
      }
      //ict button
      else if (e.getSource() == ict) {
       
         File txt = new File("employee2.txt");
         Scanner scanner = null;
      
         try {
            scanner = new Scanner(txt);
         
         }catch (FileNotFoundException ex) {
            ex.printStackTrace();
         }
      
      //String st = br.readLine();
         ICT ict = new ICT();
      
         while(scanner.hasNextLine()){
            String line = scanner.nextLine();
         
            StringTokenizer stn = new StringTokenizer(line,";");   
            ict.setFirstName(stn.nextToken(";"));
            ict.setLastName(stn.nextToken(";"));
            ict.setId(stn.nextToken(";"));
            ict.setDateOfBirth(stn.nextToken(";"));
            ict.setGender(stn.nextToken(";"));
            ict.setAdress(stn.nextToken(";"));
            ict.setTitleOfEmployment(stn.nextToken(";"));
            ict.setDateHired(stn.nextToken(";"));
            ict.setDepartment(stn.nextToken(";"));
            ict.setHoursWorked(Integer.parseInt(stn.nextToken(";")));
            ict.setRateOfPay(Double.parseDouble(stn.nextToken(";")));
            ict.setLeaveDays(Integer.parseInt(stn.nextToken(";")))  ; 
            ict.setCarAllowance(Double.parseDouble(stn.nextToken(";"))); 
            ict.setMonthlyGratuity(Integer.parseInt(stn.nextToken(";")));
            ict.setTaxRate(Double.parseDouble(stn.nextToken(";")));
         
            if(ict.getTitleOfEmployment().equalsIgnoreCase("ICT")){
               textArea.setText(textArea.getText() + "\n"+ict.getFirstName()+"  "+ ict.getTaxAmount()+"  "+ ict.getSalary());
            }
         }
      }//ceo button
      else if (e.getSource() == ceo) {
       
         File txt = new File("employee2.txt");
         Scanner scanner = null;
      
         try {
            scanner = new Scanner(txt);
         
         }catch (FileNotFoundException ex) {
            ex.printStackTrace();
         }
      
      //String st = br.readLine();
         Ceo ceo = new Ceo();
      
         while(scanner.hasNextLine()){
            String line = scanner.nextLine();
         
            StringTokenizer stn = new StringTokenizer(line,";");   
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
               textArea.setText(textArea.getText() + "\n"+ceo.getFirstName()+"  "+ ceo.getTaxAmount()+"  "+ ceo.getSalary());
            }
         }
      } 
   //sales button
      else if (e.getSource() == sales) {
       
         File txt = new File("employee2.txt");
         Scanner scanner = null;
      
         try {
            scanner = new Scanner(txt);
         
         }catch (FileNotFoundException ex) {
            ex.printStackTrace();
         }
      
      //String st = br.readLine();
         Sales sale = new Sales();
      
         while(scanner.hasNextLine()){
            String line = scanner.nextLine();
         
            StringTokenizer stn = new StringTokenizer(line,";");   
            sale.setFirstName(stn.nextToken(";"));
            sale.setLastName(stn.nextToken(";"));
            sale.setId(stn.nextToken(";"));
            sale.setDateOfBirth(stn.nextToken(";"));
            sale.setGender(stn.nextToken(";"));
            sale.setAdress(stn.nextToken(";"));
            sale.setTitleOfEmployment(stn.nextToken(";"));
            sale.setDateHired(stn.nextToken(";"));
            sale.setDepartment(stn.nextToken(";"));
            sale.setHoursWorked(Integer.parseInt(stn.nextToken(";")));
            sale.setRateOfPay(Double.parseDouble(stn.nextToken(";")));
            sale.setLeaveDays(Integer.parseInt(stn.nextToken(";")))  ; 
            sale.setCarAllowance(Double.parseDouble(stn.nextToken(";"))); 
            sale.setMonthlyGratuity(Integer.parseInt(stn.nextToken(";")));
            sale.setTaxRate(Double.parseDouble(stn.nextToken(";")));
         
            if(sale.getTitleOfEmployment().equalsIgnoreCase("Sales")){
               textArea.setText(textArea.getText() + "\n"+sale.getFirstName()+"  "+ sale.getTaxAmount()+"  "+ sale.getSalary());
            }
         }
      } 
   //drivers button
      else if (e.getSource() == drivers) {
       
         File txt = new File("employee2.txt");
         Scanner scanner = null;
      
         try {
            scanner = new Scanner(txt);
         
         }catch (FileNotFoundException ex) {
            ex.printStackTrace();
         }
      
      //String st = br.readLine();
         Drivers drive = new Drivers();
      
         while(scanner.hasNextLine()){
            String line = scanner.nextLine();
         
            StringTokenizer stn = new StringTokenizer(line,";");   
            drive.setFirstName(stn.nextToken(";"));
            drive.setLastName(stn.nextToken(";"));
            drive.setId(stn.nextToken(";"));
            drive.setDateOfBirth(stn.nextToken(";"));
            drive.setGender(stn.nextToken(";"));
            drive.setAdress(stn.nextToken(";"));
            drive.setTitleOfEmployment(stn.nextToken(";"));
            drive.setDateHired(stn.nextToken(";"));
            drive.setDepartment(stn.nextToken(";"));
            drive.setHoursWorked(Integer.parseInt(stn.nextToken(";")));
            drive.setRateOfPay(Double.parseDouble(stn.nextToken(";")));
            drive.setLeaveDays(Integer.parseInt(stn.nextToken(";")))  ; 
            drive.setCarAllowance(Double.parseDouble(stn.nextToken(";"))); 
            drive.setMonthlyGratuity(Integer.parseInt(stn.nextToken(";")));
            drive.setTaxRate(Double.parseDouble(stn.nextToken(";")));
         
            if(drive.getTitleOfEmployment().equalsIgnoreCase("Driver")){
               textArea.setText(textArea.getText() + "\n"+drive.getFirstName()+"  "+ drive.getTaxAmount()+"  "+ drive.getSalary());
            }
         }
      } //temp button
      else if (e.getSource() == temporaryStaff) {
       
         File txt = new File("employee2.txt");
         Scanner scanner = null;
      
         try {
            scanner = new Scanner(txt);
         
         }catch (FileNotFoundException ex) {
            ex.printStackTrace();
         }
      
      //String st = br.readLine();
         TemporaryStaff tempo = new TemporaryStaff();
      
         while(scanner.hasNextLine()){
            String line = scanner.nextLine();
         
            StringTokenizer stn = new StringTokenizer(line,";");   
            tempo.setFirstName(stn.nextToken(";"));
            tempo.setLastName(stn.nextToken(";"));
            tempo.setId(stn.nextToken(";"));
            tempo.setDateOfBirth(stn.nextToken(";"));
            tempo.setGender(stn.nextToken(";"));
            tempo.setAdress(stn.nextToken(";"));
            tempo.setTitleOfEmployment(stn.nextToken(";"));
            tempo.setDateHired(stn.nextToken(";"));
            tempo.setDepartment(stn.nextToken(";"));
            tempo.setHoursWorked(Integer.parseInt(stn.nextToken(";")));
            tempo.setRateOfPay(Double.parseDouble(stn.nextToken(";")));
            tempo.setLeaveDays(Integer.parseInt(stn.nextToken(";")))  ; 
            tempo.setCarAllowance(Double.parseDouble(stn.nextToken(";"))); 
            tempo.setMonthlyGratuity(Integer.parseInt(stn.nextToken(";")));
            tempo.setTaxRate(Double.parseDouble(stn.nextToken(";")));
         
            if(tempo.getTitleOfEmployment().equalsIgnoreCase("tempSales")){
               textArea.setText(textArea.getText() + "\n"+tempo.getFirstName()+"  "+ tempo.getTaxAmount()+"  "+ tempo.getSalary());
            }
         }
      } 
      
      else if (e.getSource() == tourGuides) {
       
         File txt = new File("employee2.txt");
         Scanner scanner = null;
      
         try {
            scanner = new Scanner(txt);
         
         }catch (FileNotFoundException ex) {
            ex.printStackTrace();
         }
      
      //String st = br.readLine();
         TourGuides tour = new TourGuides();
      
         while(scanner.hasNextLine()){
            String line = scanner.nextLine();
         
            StringTokenizer stn = new StringTokenizer(line,";");   
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
         
            if(tour.getTitleOfEmployment().equalsIgnoreCase("tourOprator")){
               textArea.setText(textArea.getText() + "\n"+tour.getFirstName()+"  "+ tour.getTaxAmount()+"  "+ tour.getSalary());
            }
         }
      } //females button
      else if (e.getSource() == females) {
            //creating File instance to reference text file in Java
         File text = new File("employee2.txt");
      
            //list = new Label("Employee List ");
            //Creating Scanner instance to read File in Java
         Scanner scanner = null;
      
            /* wrap the scanner object withing try catch statement for possible file not found exception*/
         try {
            scanner = new Scanner(text);
         } catch (FileNotFoundException ex) {
            ex.printStackTrace();
         }
      
         StringTokenizer stringTokenizer;
      
            //Reading each line of file using Scanner class
            //int lineNumber = 1;
         while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            StringTokenizer stn = new StringTokenizer(line,";");   
            String FirstName=stn.nextToken(";");
            String LastName=stn.nextToken(";");
            String Id=stn.nextToken(";");
            String Gender=stn.nextToken(";");
            String DateOfBirth=stn.nextToken(";");
            String Adress=stn.nextToken(";");
            String TitleOfEmployment=stn.nextToken(";");
            String DateHired=stn.nextToken(";");
            String Department=stn.nextToken(";");
            int HoursWorked=Integer.parseInt(stn.nextToken(";"));
            double RateOfPay=Double.parseDouble(stn.nextToken(";"));
            int LeaveDays=Integer.parseInt(stn.nextToken(";")); 
            double CarAllowance=Double.parseDouble(stn.nextToken(";")); 
            int MonthlyGratuity=Integer.parseInt(stn.nextToken(";"));
            double TaxRate=Double.parseDouble(stn.nextToken(";"));
         
            if(Gender.equalsIgnoreCase("f"))
            textArea.setText(textArea.getText() + "\n" + FirstName + "\t\t\t" + Gender+ "\t\t" + LastName);
          
         
         }
      }
      else if (e.getSource() == sch) {
            //creating File instance to reference text file in Java
         File text = new File("employee2.txt");
      
            //list = new Label("Employee List ");
            //Creating Scanner instance to read File in Java
         Scanner scanner = null;
      
            /* wrap the scanner object withing try catch statement for possible file not found exception*/
         try {
            scanner = new Scanner(text);
         } catch (FileNotFoundException ex) {
            ex.printStackTrace();
         }
      
         StringTokenizer stringTokenizer;
      
            //Reading each line of file using Scanner class
            //int lineNumber = 1;
         while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            StringTokenizer stn = new StringTokenizer(line,";");   
            String FirstName=stn.nextToken(";");
            String LastName=stn.nextToken(";");
            String Id=stn.nextToken(";");
            String Gender=stn.nextToken(";");
            String DateOfBirth=stn.nextToken(";");
            String Adress=stn.nextToken(";");
            String TitleOfEmployment=stn.nextToken(";");
            String DateHired=stn.nextToken(";");
            String Department=stn.nextToken(";");
            int HoursWorked=Integer.parseInt(stn.nextToken(";"));
            double RateOfPay=Double.parseDouble(stn.nextToken(";"));
            int LeaveDays=Integer.parseInt(stn.nextToken(";")); 
            double CarAllowance=Double.parseDouble(stn.nextToken(";")); 
            int MonthlyGratuity=Integer.parseInt(stn.nextToken(";"));
            double TaxRate=Double.parseDouble(stn.nextToken(";"));
         
           
         if (field.getText()==Id) {
            textArea.setText(textArea.getText() + "\n" + FirstName + "\t\t\t" + Gender+ "\t\t" + LastName);
        } else {
            textArea.setText("You have not left a comment.");
        }    
         
         }
      }

           
   }
}
