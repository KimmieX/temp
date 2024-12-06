// To be able to use the scanner class, it must be imported
import java.util.Scanner;

public class TemperatureConverter{                              // to make the code accessible from a different class
    public static void main(String[] args){                     // to start the application execution 
        Scanner scanner = new Scanner(System.in);               // imported scanner class
            System.out.println("This is a temperature converter. Select the conversion you want to make. \n 1. Convert Celsius to Fahrenheit \n 2. Convert Fahrenheit to Celsius ");
            int option = scanner.nextInt();                     // storing user option input

            //converting from Celsius to Fahrenheit and printing it out
            if (option == 1){
                System.out.println("Input temperature in °Celsius");
                double celsius = scanner.nextDouble();           // storing value for conversion
                double celToFah = (celsius * 1.8) + 32;         // converting from °C to °F
                double answer = celToFah;                       // storing answer
                System.out.println("The equivalent of " + celsius + "° Celsius is " + answer + "° Fahrenheit");
                
            //converting from Fahrenheit to Celsius and print it out
            } else if (option == 2){
                System.out.println("Input temperature in °Fahrenheit");
                double fahrenheit = scanner.nextDouble();        // storing value for conversion
                double fahToCel = (fahrenheit - 32) * 5/9;      // converting from °F to °C
                double conv = fahToCel;                         // storing answer
                System.out.println("The equivalent of " + fahrenheit + "° Fahrenheit is " + conv + "° Celsius");

            //making the user aware if an invalid option was choosen and restating the valid options    
            } else {
                System.out.println("Invalid option. Please  select 1 or 2.");
            }
        scanner.close(); 
        }

    }

//System.out.println() is to print out the instructions to the user. 
    

