
package August27;


public class Pets {
    String name;
    String breed;
    int age;
    char gender;
    String color;
    
    //method without an argument and returning type
    void showPetDetails(){
        System.out.println("Pet details: \nname: "+name+"\nbreed: "+breed+"\nage: "+age+"\ngender: "+gender+"\ncolor: "+color);   
    }
    
    //method without an argument with returning type
    String saysBark(){
        return "bark! bark! bark!";
    }
    
    //method with an argument and no returning type
    void whatBreed(String breed, int age){
        System.out.println("My breed is "+breed+ " and I am "+age+" years old");
    }
}
