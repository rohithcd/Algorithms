import java.io.*;
import java.util.*;



class bubblesort { 
    static void bubbleSort(int[] arr) { 
    int n = arr.length; 
    int temp = 0; 
    for(int i=0; i < n; i++){ 
    for(int j=0; j < n-i-1; j++){ 
    if(arr[j] > arr[j+1]){ 
    //swap elements
    temp = arr[j]; 
    arr[j] = arr[j+1]; 
    arr[j+1] = temp; } 
    } 
    } 
   }
    public static void main(String[] args) { 
        int max;
        int[] arr;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the  number of elements");
        max = sc.nextInt();
        arr = new int[max];

        System.out.println("Enter the  array elements");
        for (int i = 0; i < max; i++) {
            arr[i] = sc.nextInt();
        }
 
 
 
 bubbleSort(arr);//sorting array elements using bubble sort
 System.out.println("SORTED ARRAY"); 
 for(int i=0; i < arr.length; i++){ 
 System.out.print(arr[i] + " "); 
 } } 
}


