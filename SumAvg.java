import java.util.*;
public class SumAvg {
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
        sumavg(arr,n);
        
    }
    public static void sumavg(int[] arr,int n)
    {
        int sum=0;
       // int i=0,j=n-1;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            
        }
        double avg=(double) sum/n;
        System.out.println("The sum of the elements in the array is:" + " "+sum);
        System.out.println("The average of the elements in the array is:" + " "+avg);
    }
    
}
