import java.io.*;
import java.util.Scanner;

public class BubbleSort 
{
    static void sort(int []arr)
    {
        int n = arr.length;
        int  temp = 0;

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static void display(int []arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[])
    throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {};

        System.out.print("Enter size of array: ");
        int size = sc.nextInt(); 
        arr = new int[size];

        System.out.println("Enter the Elements");

        for(int i=0; i<size; i++)
        {
            System.out.print("Element " + i + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Array before Bubble sort");
        display(arr);
        System.out.println();

        sort(arr);
    
        System.out.println("Array after Bubble sort");
        display(arr);

        sc.close();
    }
}