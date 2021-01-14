import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * Java program to read file using Scanner class in Java.
 * java.util.Scanner is added on Java 5 and offer convenient method to read data
 *
 */
public class Main {

    public static void main(String args[]) throws FileNotFoundException {

        //creating File instance to reference text file in Java
        File text = new File("Employees.txt");

        //Creating Scanner instnace to read File in Java
        Scanner scanner = new Scanner(text);

        StringTokenizer stringTokenizer;

        //Reading each line of file using Scanner class
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();

            stringTokenizer = new StringTokenizer(line,";");
            System.out.println("ID :"+stringTokenizer.nextToken());
            System.out.println("FirstName :"+stringTokenizer.nextToken());
            System.out.println("LastName :"+stringTokenizer.nextToken());
           
            stringTokenizer.nextToken();
            System.out.println("DOB :"+stringTokenizer.nextToken());


        }

    }

}