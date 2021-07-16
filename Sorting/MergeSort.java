import java.io.*;
import java.util.Scanner;

public class MergeSort 
{
    static void merge(int arr[],int p, int m, int r)
    {
        int n1 = m - p + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i=0; i<n1; ++i)
        {
            L[i] = arr[p + i];
        }

        for(int j=0; j<n2; ++j)
        {
            R[j] = arr[m + 1 + j];
        }

        int i = 0, j = 0, k = p;

        while(i < n1 && j < n2)
        {
            if(L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while(i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        while(j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    static void sort(int []arr, int p, int r)
    {
        if(p < r)
        {
            int m = p + (r - p)/2;
            sort(arr, p, m);
            sort(arr, m+1, r);
            merge(arr, p, m, r);
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

        System.out.println("Array before Merge sort");
        display(arr);
        System.out.println();

        sort(arr, 0, arr.length-1);
    
        System.out.println("Array after Merge sort");
        display(arr);

        sc.close();
    }
}