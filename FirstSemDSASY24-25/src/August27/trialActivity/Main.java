/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package August27.trialActivity;

/**
 *
 * @author hp
 */
public class Main{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        list.insertAtBeginning(10);
        list.insertAtEnd(30);
        list.insertAtPosition(1, 20);
        list.insertAtBeginning(5);
        list.insertAtEnd(40);
        
        System.out.println("");
        list.display();
    }
}

