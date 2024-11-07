/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SearchingAlgo;

/**
 *
 * @author hp
 */
public class LinearSearch {
    public static int linearSearch(int[] arr, int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
}
