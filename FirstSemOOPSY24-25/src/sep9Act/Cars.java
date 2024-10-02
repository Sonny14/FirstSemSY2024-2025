/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sep9Act;

/**
 *
 * @author hp
 */
public class Cars {
    
    private int chassisNum;
    private String model;
    private final String brand = "Honda";
    
    public Cars(){
        this.chassisNum = 6978;
        this.model = "Civic";
    }
    
    public Cars(String model, int plateNum){
        this.model = model;
        this.chassisNum = plateNum;
    }
    
    public String setInfo(){
        System.out.println("\nModel has been removed");
        return model = "";
    }
    
    public void setInfo(String model){
        this.model = model;
        System.out.println("\nYour car model has been set");
    }
    
    public void setInfo(int chassisNum){
        this.chassisNum = chassisNum;
        System.out.println("\nChassis number has been updated");
    }
    
    void displayInfo(){
        System.out.println("\nBrand: "+this.brand+"\nModel: "+this.model+"\nPlate Number: "+this.chassisNum);
    }
    
    
}
