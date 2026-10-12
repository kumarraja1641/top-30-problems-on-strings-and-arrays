import java.util.*;
public class TrappingRainWater
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter the size of array");
        n=sc.nextInt();
        System.out.println("enter array elemnts");
        int[] arr=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }


        int better=butt(arr,n);
        System.out.println("better"+" "+better);


       // int max=trap(arr,n);
       // System.out.println(max);
    }


    public static int butt(int[] arr, int n)
    {
        int[] lmax=new int[n];
        int[] rmax=new int[n];

        lmax[0]=arr[0];
    for(int i=1;i<n;i++)
    {
        lmax[i]=Math.max(lmax[i-1],arr[i]);
    }
    rmax[n-1]=arr[n-1];
    for(int j=n-2;j>=0;j--)
    {
        rmax[j]=Math.max(rmax[j+1],arr[j]);
    }  

    int ans=0;

    for(int i=1;i<arr.length-1;i++)
    {
        ans+=Math.min(rmax[i],lmax[i])-arr[i];
    }
    return ans;



    }

    /*

    public static int trap(int[] arr,int n)
    {
          int ans=0;
        for(int i=1;i<n-1;i++)
        {
            int lmax=getleftmax(i,arr);
            int rmax=getrightmax(i,arr);
            int height=Math.min(rmax,lmax);
           // ans+=height-arr[i];
           height=height-arr[i];
           ans+=height;
        }
        return ans;
    }


    public static int getleftmax(int i,int[] arr)
    {
      //  int max1=0;
      int max2=0;
        for(int k=i;k>0;k--)
        {
           // int prev=arr[k-1];
           int max1=Math.max(arr[k],arr[k-1]);
           max2=Math.max(max2,max1);



           
         
        }
        return max2;
    }

    public static int getrightmax(int i,int[] arr)
    {
       int max1=0;
        for(int k=i;k<arr.length;k++)
        {
            int rmax=arr[k];
            max1=Math.max(rmax,max1); 
        }
        return max1;
    }

     */

}