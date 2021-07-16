import java.io.*;
import java.util.Scanner;

public class SelectionSort 
{
    static void sort(int []arr)
    {
        int n = arr.length;

        for(int i=0; i<n-1; i++)
        {
            int min = i;
            for(int j=i+1; j<n; j++)
            {
                if(arr[j] < arr[min])
                {
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
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

        System.out.println("Array before Selection sort");
        display(arr);
        System.out.println();

        sort(arr);
    
        System.out.println("Array after Selection sort");
        display(arr);

        sc.close();
    }
}