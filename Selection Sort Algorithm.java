package com.pratik;
import java.util.Arrays;
public class Selection_Sort {
    public static void main(String[] args){
        int[]arr = {5,4,1,8,6};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selection(int[]arr){
        for(int i=0;i <arr.length; i++){
            // Find the maximum item in the remaining array and swap with correct index
            int last = arr.length-i-1;
            int maxIndex=getMaxIndex(arr, start:0, last );     //created another function - getMaxIndex
            swap(arr,maxIndex,last);
        }
    }
    static void swap(int[] arr,int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int getMaxIndex(int[]arr,int start,int end){
        int max=start;
        for(int i = start ; i<=end ; i++){
            if(arr[max]< arr[i]){
                max = i;
            }
        }
        return max;
    }
}
