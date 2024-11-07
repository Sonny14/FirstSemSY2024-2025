package Interface;
/**
 *
 * @author hp
 */

/* PART 1


// This will print an error, Conversation is not abstract and does not override abstract method goodbye() in NewInterface if there is no body.
    abstract class Conversation implements NewInterface{

    @Override
    public void print() {
        
    }

    @Override
    public void greetings(String message) {
        
    }

/*  You can choose to remove a method by making the class abstract 
    @Override
    public String goodbye() {
        return "goodbye";
    }
   
    }

*/

// PART 2 

class Conversation implements Greet, Bye{

    @Override
    public void greetings(String message) {
        System.out.println(message);
    }
    
    @Override
    public void print() {
        greetings("Good morning");
        System.out.println(goodbye());
    }

    @Override
    public String goodbye() {
        return "Goodbye";
    }
    
}

// PART 3 

/* 
    Nested, to implement a nested interface, you must call first the outer interfaces or class before the inner interfaces.
*/
class NestedInterface implements Test.Yes, Test.No, Test{

    @Override
    public void show() {
        System.out.println("It's a yes!");
    } 
        
    @Override
    public void print() {
        System.out.println("It's a no!");
    }     

    @Override
    public void YesNo() {
        System.out.println("Yes or No?");
    }
    
}


public class InterMain{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Conversation convo = new Conversation();
        convo.print();*/
        
        NestedInterface obj = new NestedInterface();
        obj.show();
        
        
    }
    
}
