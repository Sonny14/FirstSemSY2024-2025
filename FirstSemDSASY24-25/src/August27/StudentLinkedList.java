package August27;


public class StudentLinkedList {
    StudentNode head;
    
    public StudentLinkedList(){
        head = null;
    }
    
    public void addStudent(int id, String name, double grade){
        StudentNode newNode = new StudentNode(id, name, grade);
        if (head==null){
            head = newNode;
        }else{
            StudentNode current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void displayStudents(){
        StudentNode current = head;
        while (current != null){
            System.out.println("Student ID: "+current.id+" Name: "+current.name+" Grade: "+current.grade);
            current = current.next;
        }
    }
}
