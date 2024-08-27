/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package August27;

/**
 *
 * @author hp
 */
public class Main {
    public static void main(String[] args) {
        StudentLinkedList studentList = new StudentLinkedList();
        
        studentList.addStudent(1, "Abdul", 75.00);
        studentList.addStudent(2, "Gafar", 69.00);
        studentList.addStudent(3, "Adolf", 99.00);
        studentList.addStudent(4, "Ritch", 999999);
        
        System.out.println("All Students: ");
        studentList.displayStudents();
        
    }
}
