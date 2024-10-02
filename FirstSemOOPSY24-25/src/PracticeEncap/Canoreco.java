/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticeEncap;
import java.util.*;
/**
 *
 * @author hp
 */
public class Canoreco {
    
    private int accNum;
    private double total;
    private final double discount = 0.10;
    private String accName;
    private static double balance = 100;
    
    public Canoreco(int accNum, String accName, boolean eligibility){
        this.accNum = accNum;
        this.accName = accName;
        if(eligibility == true){
            double less = balance * discount;
            this.total = balance - less;
        }else{
            this.total = balance;
        }
    }
    
    public double getTotal(){
        return total;
    }
    
    public String getName(){
        return accName;
    }
    
    public int getAccNum(){
        return accNum;
    }
    
}
