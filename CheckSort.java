import java.util.*;
public class CheckSort {
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        boolean is=sorted(arr,n);
        if(is)
        {
            System.out.println("The array is sorted");
        }
        else
        {
            System.out.println("The array is not sorted");
        }
    }
    public static boolean sorted(int[] arr,int n)
    {
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]<=arr[i+1])
            {

            }
            else
            {
                return false;
            }
        }
        return true;
    }
    

    
}
