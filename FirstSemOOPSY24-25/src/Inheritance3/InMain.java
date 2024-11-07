/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance3;

/**
 *
 * @author hp
 */

class One{
    int age;
   One(int age){
        System.out.println("I am now"+this.age);
    }
}

public class InMain extends One{
    InMain(int age){
         super(age);

     
        System.out.println("Iam"+this.age);
    }
    
    public static void main(String[] args) {
        InMain four = new InMain(4);
    }
    
    
}
