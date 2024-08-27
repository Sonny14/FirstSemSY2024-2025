/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package August27;

/**
 *
 * @author hp
 */
public class StudentNode {
    int id;
    String name;
    double grade;
    StudentNode next;
    
    public StudentNode(int id, String name, double grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.next = null;
    }
}
