import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
 public class Tesater{
 public static void main(String [] args)throws Exception{
      File text = new File("employee.txt");
      Scanner scanner = new Scanner(text);
      while(scanner.hasNextLine()){
      String line = scanner.nextLine();
      //System.out.println(line.substring(0,19));
      
            System.out.println("name :"+line.substring(0,21));
            System.out.println("DOB :"+line.substring(22,30));

      }
      
      }
}