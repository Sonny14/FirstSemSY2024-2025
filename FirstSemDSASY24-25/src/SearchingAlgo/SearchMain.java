/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SearchingAlgo;

import static SearchingAlgo.BinarySearch.binarySearch;
import static SearchingAlgo.InterpolationSearch.interpolationSearch;
import static SearchingAlgo.LinearSearch.linearSearch;



/**
 *
 * @author hp
 */
public class SearchMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Linear Search
        int[] array = {10,23,5,3,7,18};
        int target = 3;
        int result = linearSearch(array, target);
        
        if(result != -1){
            System.out.println("Element found at index "+result);
        }else{
            System.out.println("Element not found");
        } */
        
        /* Binary Search
        int[] array = {2,3,5,7,9,12,15,18};
        int target = 7;
        int result = binarySearch(array, target, 0, array.length - 1);
        
        if (result != -1){
            System.out.println("Element found at index: "+result);
        }else{
            System.out.println("Element not found");
        } */
        
        // Interpolation Search
        int[] array = {2,3,5,7,9,12,15,18};
        int target = 7;
        int result = interpolationSearch(array, 0, array.length - 1, target);
        
        if(result != -1){
            System.out.println("Element fount at index: "+result);
        }else{
            System.out.println("Element not found");
        }
    }
    
}
