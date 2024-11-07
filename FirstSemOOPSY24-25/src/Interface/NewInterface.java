/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

/**
 *
 * @author hp
 */

// The class with the filename should always be in public 
public interface NewInterface {
    // An interface is declared as public, static, and final by default
    String name = "Sonny"; // if this was declared without a value an error will be posted
    
    /* 
        An abstract method has no body, or you can declare it as static.
        abstract void print(){
            System.out.println("HAHAHA");
        }
    */
    
    // In an interface all methods declared is considered as an abstract method
    // If a method is a static, it cannot be overriden 
    default void print(){
    
    }
    //abstract void greetings(String message);
    //String goodbye();
}

// Multiple instances through interfaces
interface Greet extends NewInterface{
    void greetings(String message);
}

interface Bye extends NewInterface{
    String goodbye();
}

/* 
    Nested Interfaces, Example of interaces in another interfaces.
*/ 

interface Test{
    void YesNo();
    interface Yes{
        void show();
    }
    interface No{
        void print();
    }
}

    



