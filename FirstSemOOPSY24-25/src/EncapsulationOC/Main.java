/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EncapsulationOC;

/**
 *
 * @author hp
 */
public class Main {
    public static void main(String[] args) {
        
        //In this scenario the first name that has been initialized in the SetterGetter(); construcor will become null
        //after the new instance of obj1 which is called data loss.
        SetterGetter obj1 = new SetterGetter();
        obj1.displayInfo();
        obj1 = new SetterGetter("palma",19);
        obj1.displayInfo();
        
//        
//        //C-create, R-retrive, U-update, D-delete
//        SetterGetter obj2 = new SetterGetter("Sonny","Palma",19);
//        obj2.displayInfo();
//        obj2.setFirstName("Hello");
//        obj2.displayInfo();
//        
//        //Delete
//        obj2.deleteAge();
//        obj2.setLastName("");
//        System.out.println("---------------------");
//        obj2.displayInfo();
//        
    }
}
