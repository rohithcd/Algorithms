import java.io.*;
import java.util.Scanner;

public class QuickSort 
{
    static void sort(int []arr, int left, int right)
    {
        if(right > left)
        {
            int i = left, j = right, temp;
            int pivot = arr[right];

            do
            {
                while(arr[i] < pivot)
                {
                    i++;
                }

                while(arr[j] > pivot)
                {
                    j--;
                }

                if(i <= j)
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
            } while(i<=j);

            if(left < j)
            {
                sort(arr, left, j);
            }

            if(i < right)
            {
                sort(arr, i, right);
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

        System.out.println("Array before Quick sort");
        display(arr);
        System.out.println();

        sort(arr, 0, arr.length-1);
    
        System.out.println("Array after Quick sort");
        display(arr);

        sc.close();
    }
}