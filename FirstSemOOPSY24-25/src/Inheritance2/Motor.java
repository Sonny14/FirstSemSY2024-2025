/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance2;
import Inheritance1.Vehicle;
/**
 *
 * @author hp
 */
public class Motor extends Vehicle{
    
    String plateNum;
    
    public Motor(String brand, String model){
        super(brand, model);
    }
    
    @Override
    public void display(){
        System.out.println("Model: "+model);
        System.out.println("Brand: "+brand);
        System.out.println("Plate Number: "+plateNum);
    }
    
    public static void main(String[] args) {
        Motor motor1 = new Motor("yamaha", "sniper");
        motor1.brand = "Honda";
        motor1.plateNum = "890";
        motor1.setModel("Click");
        motor1.display();
    }
}
