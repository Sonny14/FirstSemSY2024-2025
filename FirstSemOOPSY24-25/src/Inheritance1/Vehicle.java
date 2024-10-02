/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance1;

/**
 *
 * @author hp
 */
public class Vehicle {
    protected String brand;
    public String model;
    
    public Vehicle(String brand, String model){
        this.brand = brand;
        this.model = model;
    }
    
    public void display(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
    }
    
    public void setModel(String model){
        this.model = model;
    }
}


