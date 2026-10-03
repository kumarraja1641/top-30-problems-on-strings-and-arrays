import java.util.*;
public class Rightrotate {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the array");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("right rotate by one only");
        //int k=sc.nextInt();
        rightrotate(arr,n);
    }
    public static void rightrotate(int[] arr,int n)
    {
        int last=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[0]=last;
        System.out.println("The elements in the array after right rotation are:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
    
}
