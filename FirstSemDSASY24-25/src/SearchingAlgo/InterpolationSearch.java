/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SearchingAlgo;

/**
 *
 * @author hp
 */
public class InterpolationSearch {
    public static int interpolationSearch(int[] arr, int low, int high, int key){
        while(low <= high && key >= arr[low] && key <= arr[high]){
            int pos = low + ((key - arr[low]) * (high - low) / (arr[high] - arr[low]));
            
            if(arr[pos] == key){
                return pos;
            }
            
            if(arr[pos] < key){
                low = pos + 1;
            }else{
                high = pos - 1;
            }
        }
        return -1;
    }
}
