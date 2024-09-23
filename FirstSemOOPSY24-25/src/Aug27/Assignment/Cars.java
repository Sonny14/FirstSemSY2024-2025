package Aug27.Assignment;
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class Cars {
    
    Scanner scan = new Scanner(System.in);
    
    String model, brand, color, name, plateNumber;
    int carNumber;
    
    //method without an argument and returning type
    void intro(){
        System.out.println("Welcome to Wheels On Fire Insurance Services!");
    }
    
    //method without an argument with returning type
    String showCarDetails(){
        return "Details of your Car no. "+carNumber+"\nModel: "+model+"Brand: "+brand+"Color: "+color+"Plate number: "+plateNumber;
    }
    
    //method with an argument but no returning type
    void ownerDetails(String name){
        System.out.println("Thank you! "+name+"!");
        System.out.println("\nYou can now enter your car's details");
    }   
    
    //method with an argument and returning type
    String getCarDetails(String model, String brand, String color, String plateNumber){
        return model + brand + color + plateNumber;
    }
}
