/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EncapsulationOC;

/**
 *
 * @author hp
 */
public class SetterGetter {
    
    private String firstName, lastName;
    private int age;
    
    //Overloading is creating same method but differs in parameter one is blank the other has 
    public SetterGetter(){
        this.firstName = "firstSam";
    }
    
    
    public SetterGetter(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    
    //Retrieve
    public String getFirstName(){
        return firstName; 
    }

    public String getLastName(){
        return lastName;
    }
    
    public int getAge(){
        return age;
    }
    
    //Set or Update
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    void displayInfo(){
        System.out.println("First name: "+this.firstName+"\nLast name: "+getLastName()+"\nAge: "+this.age);
        
    }
    
    //Delete
    public String deleteFirstName(){
        return this.firstName = "";
    }
    
    public String deleteLastName(){
        return this.lastName = "";
    }
    
    public int deleteAge(){
        return this.age = 0;
    }
    
    
}
