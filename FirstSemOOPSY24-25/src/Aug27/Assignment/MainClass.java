package Aug27.Assignment;
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class MainClass {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       Cars car1 = new Cars();
       car1.intro();
       System.out.print("\nBefore we proceed please enter your name: ");
       car1.ownerDetails(scan.nextLine());
       
       System.out.print("Model: ");
       car1.model = scan.nextLine();
       System.out.print("Brand: ");
       car1.brand = scan.nextLine();
       System.out.print("Color: ");
       car1.color = scan.nextLine();
       System.out.print("Plate number: ");
       car1.plateNumber = scan.nextLine();
       car1.getCarDetails(car1.model, car1.brand, car1.color, car1.plateNumber);
        System.out.println("asdfasd");
    }
    
}
