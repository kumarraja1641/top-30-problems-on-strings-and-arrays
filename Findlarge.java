import java.util.*;
public class Findlarge
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the array:");
        n = sc.nextInt();
        if(n<=0)
        {
            System.out.println("Array size must be greater than 0");
            return;
        }
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int larg=largest(arr,n);
        System.out.println("largest arraay belemt is"+ " "+ larg);
       
       
    }

    public static int largest(int arr[], int n)
    {
       int max=arr[0];
       for(int i=1;i<n;i++)
       {
        if(arr[i]>max)
        {
            max=arr[i];
        }
       }
       return max;
    }
}