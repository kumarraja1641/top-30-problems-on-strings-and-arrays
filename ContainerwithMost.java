import java.util.*;

public class ContainerwithMost {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.err.println("enter size of array");
        int n=sc.nextInt();
        System.out.println("enter array elements");

        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }

      /*
      int max1=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int area=Math.min(arr[i],arr[j])* (j-i);
                max1=Math.max(area,max1);
            }
        }
        System.out.println(max1);
        */

        int max2=maxy(arr);
        System.out.println(max2);
        


    }
    public static int maxy(int[] arr)
    {
        int n=arr.length;
        int max1=0;
        int i=0,j=n-1;
        while(i<j)
        {
            int area=Math.min(arr[i],arr[j])*(j-i);
            max1=Math.max(area,max1);
        
        if(arr[i]>arr[j])
            j--;
        else
            i++;
         }
     return max1;

    }
   

    
}
