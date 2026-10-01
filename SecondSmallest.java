import java.util.*;
public class SecondSmallest {
    Scanner sc=new Scanner(System.in);
   // int n;
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the array:");
        n=sc.nextInt();
        if(n<=1) {
            System.out.println("Array size must be greater than 1");
            return;
        }
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int secondSmallest=secondsmallest(arr,n);
        System.out.println("Second smallest array element is"+" "+secondSmallest);
    }
    public static int secondsmallest(int arr[],int n)
    {
        int small=arr[0];
        int secondsmall=arr[1];
        for(int i=1;i<n;i++)
        {
            if(arr[i]<small)
            {
                secondsmall=small;
                small=arr[i];
            }
            else if (arr[i]<secondsmall && arr[i]!=small)
            {
                secondsmall=arr[i];
            }
        }
        return secondsmall;
    }
    
    
}
