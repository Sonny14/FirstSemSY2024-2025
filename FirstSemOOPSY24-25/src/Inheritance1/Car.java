/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance1;

/**
 *
 * @author hp
 */
public class Car extends Vehicle{
    
    String plateNum;
    
    //Super method invokes the constructor of the superclass
    public Car(String brand, String model, String plateNum){
        super(brand, model);
        this.plateNum = plateNum;
    }
    
    @Override
    public void display(){
        super.display();
        System.out.println("Plate Number: "+plateNum);
    }
    
    public static void main(String[] args) {
        Car car1 = new Car("honda", "city", "789");
        //car1.brand = "honda";
        //car1.model = "corolla";
        //car1.plateNum = "789";
        car1.display();
        
    }
}

