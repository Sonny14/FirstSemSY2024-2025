/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aug27;
//

public class Main {
    public static void main(String[] args) {
        Pets pet1 = new Pets();
        pet1.name = "Bryle";
        pet1.age = 9;
        pet1.color = "Black/White";
        pet1.gender = 'M';
        pet1.breed = "Dalmatian";
        pet1.showPetDetails();
        
        Pets pet2 = new Pets();
        pet2.name = "Sonny";
        pet2.age = 7;
        pet2.color = "Pure Black";
        pet2.gender = 'M';
        pet2.breed = "Crossbreed Aspin";
        pet2.showPetDetails();
        System.out.println("\n"+pet1.name+" says "+pet1.saysBark()+" to "+pet2.name);
        pet1.whatBreed(pet1.breed,pet1.age);
        
    }
    
}
