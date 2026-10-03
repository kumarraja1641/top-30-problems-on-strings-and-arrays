import java.util.*;
public class LeftRotate {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter the  number of elements  ");
        n=sc.nextInt();
        System.err.println("enter the array elemnts");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
        leftrotatebyone(arr,n);
    }

    public static void  leftrotatebyone(int[] arr,int n)
    {
        int f1=arr[0];
        for(int i=1;i<n;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[n-1]=f1;
        System.out.println("after left rotation of array is ");
        System.err.println(Arrays.toString(arr));
    }
    
}
