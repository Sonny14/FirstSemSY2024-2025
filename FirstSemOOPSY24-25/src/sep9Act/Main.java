/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sep9Act;

/**
 *
 * @author hp
 */
public class Main {

    public static void main(String[] args) {
        
        Cars car1 = new Cars();
        car1.displayInfo();
        
        Cars car2 = new Cars("Corolla", 66666666);
        car2.displayInfo();
        
        car1.setInfo();
        car1.displayInfo();
        
        car2.setInfo("Type R");
        car2.displayInfo();
        
        car1.setInfo(3245);
        car1.displayInfo();
    }
    
}
