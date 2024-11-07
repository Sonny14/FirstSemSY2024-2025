/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Random;
import java.util.Random;
/**
 *
 * @author hp
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        int x = rand.nextInt(10)+1;
        Boolean y = rand.nextBoolean();
        double z = rand.nextDouble();
        
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
    
}
