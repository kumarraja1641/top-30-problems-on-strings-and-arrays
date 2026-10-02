import java.util.*;
public class Countoddeven {
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
        count(arr,n);
        
    }
    public static void count(int[] arr,int n)
    {
        int odd=0,even=0;
       // int i=0,j=n-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }

        }
        System.out.println("The number of even elements in the array is:" + " "+even);
        System.out.println("The number of odd elements in the array is:" + " "+odd);
    }
    
}
