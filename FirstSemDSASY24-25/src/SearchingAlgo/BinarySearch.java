/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SearchingAlgo;

/**
 *
 * @author hp
 */
public class BinarySearch {
    public static int binarySearch(int[] arr, int key, int low, int high){
        if(low <= high){
            int mid = (low+high)/2;
            
            if(arr[mid]==key){
                return mid; // if the key was found, will return mid index.
            }else if(arr[mid]>key){
                return binarySearch(arr, key, low, mid - 1); // search in left half
            }else{
                return binarySearch(arr, key, mid + 1, high); // search in right half
            }
        }
        return -1; // error key not found
    }
}
