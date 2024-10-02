/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PracticeEncap;
import java.util.*;
/**
 *
 * @author hp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome to Canoreco Kiosk\n----------------\nChoose:\n[1] Pay bill\n[2] Check balance\n[3] Exit");
        
        while(true){
        int choice = scan.nextInt();
        switch(choice){
            
            case 1:{
                System.out.println("Eligible for discount: Y/n");
                char ans = scan.next().toLowerCase().charAt(0);
                switch(ans){
                    
                    case 'y':
                        System.out.print("Enter your account number: ");
                        int accNum = scan.nextInt();scan.nextLine();
                        System.out.print("Enter your account name: ");
                        String accName = scan.nextLine();
                        Canoreco consumer1 = new Canoreco(accNum, accName, true);
                        System.out.println("\nHello "+consumer1.getName()+" "+consumer1.getAccNum()+"\nYour total balance is: "+consumer1.getTotal());
                        break;
                    
                    case 'n':{
                        System.out.print("Enter your account number: ");
                        int accNum1 = scan.nextInt();scan.nextLine();
                        System.out.print("Enter your account name: ");
                        String accName1 = scan.nextLine();
                        Canoreco consumer2 = new Canoreco(accNum1, accName1, false);
                        System.out.println("\nHello "+consumer2.getName()+" "+consumer2.getAccNum()+"\nYour total balance is: "+consumer2.getTotal());
                        break;
                    }
                }
                break;
            }
            
            case 2:{
                
            }
            
            
            
        
        }
        }
        
        
    }
    
}
