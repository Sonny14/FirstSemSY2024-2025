package AbstractClass;
/*
    Using the keyword static methods can be called independently even without an object
    Parent.method();

    An abstract class cannot be instantiated but with the use of its subclass/es
    Parent sample = new Child();
    Child sample = new Child();
*/

abstract class NewMain {
    static String name;
    
    public NewMain(){
        System.out.println("Parent class is called");
    }
    
    //final and abstract, and abstract and static cannot be combined with each other
    static final void print(){
        System.out.println("This will print once called");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
//        NewMain sample = new Child();
//        sample.name = "sonny";
//        System.out.println("Name: "+sample.name);
//        NewMain.print();
        
        //Instantiating the outer class
        OuterChild outer = new OuterChild();
        
        //Instantiating the inner class
        //OuterChild.InnerChild objectname = new OuterChild();
        
//        OuterChild.InnerChild inner = outer.new InnerChild();
//        inner.name = "sonny";
//        System.out.println("Name inside the inner class: "+inner.name);
//        

        Child2 sam = new Child2();
        sam.methodOne();
        sam.methodTwo();
    }
    
}

class Child extends NewMain{
    public Child(){
        System.out.println("Child class is called");
    }
}

//Outer class abstract parent class
abstract class Outer{
    //declaring inner as abstract also a parent class
    abstract class Inner{
        String name;
    }
}

//child class
class OuterChild extends Outer{
    //The chiild class only inherits the inner base class, inner methods and its properties
    class InnerChild extends Inner{
        //The child class only inherits the inner base class, inner methods and its properties 
    }
}

/*errr
class Parent1{
    public void methodOne();
}

class Parent2{
    abstract public void methodOne(){
    
    }
}

class Parent3{
    abstract public void methodOne();
}
*/

abstract class Parent{
    //declaration of methods
    public abstract void methodOne();
    public abstract void methodTwo();
}

abstract class Child1 extends Parent{
    @Override
    public void methodOne(){
        System.out.println("This is methodOne");
    }
}

class Child2 extends Child1{
    @Override
    public void methodTwo(){
        System.out.println("This is methodTwo");
    }
}
/*
    if the child is unable to provide implementation to all abstract methods of the 
    parent class, then we should declare that child as abstract class so that the next
    level child class should provide implementation to the remaining abstract method
    abstract class Test extends Parent{}
*/