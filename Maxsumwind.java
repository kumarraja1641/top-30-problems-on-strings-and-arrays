import java.util.*;
public class Maxsumwind {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter window size");
        int k=sc.nextInt();
        System.out.println("enter the size of array");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
      /*  int maxsum=0;
       for(int i=0;i<=n-k;i++)
       {
        int sum=0;
        for(int j=i;j<i+k;j++)
        {
            sum+=arr[j];

            maxsum=Math.max(sum,maxsum);

            
        }
       }


       System.err.println("the maxsum is "+maxsum);

       */

       // using sliding window pattern

       int l=0,maxsum=0,ans=0;
       for(int i=0;i<n;i++)
       {
        ans+=arr[i];
        if(i-l==k)
        {
            ans=ans-arr[l];
            l++;
        }

        if(i-l+1==k)
        {
            maxsum=Math.max(ans,maxsum);
        }

       }

       System.out.println("the max sum of array"+" "+maxsum);



       
    }
    
}
