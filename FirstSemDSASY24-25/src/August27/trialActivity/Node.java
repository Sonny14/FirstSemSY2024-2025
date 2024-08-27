/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package August27.trialActivity;

/**
 *
 * @author hp
 */
public class Node {
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    Node head;
    
    public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        }else{
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    
    public void insertAtPosition(int index, int data){
        Node newNode = new Node(data);
        
        if (index == 0){
            newNode.next = head;
            head = newNode;
            return;
        }
        
        Node temp = head;
        for (int i = 0; i < index-1; i++){
            if (temp == null){
                System.out.println("Index out of bounds");
                return;
            }
            temp = temp.next;
        }
        
        newNode.next = temp.next;
        temp.next = newNode;
        
    }
    
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

