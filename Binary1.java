import java.util.*;
public class Binary1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter array elemnts");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("enter search elemnt position");
        int k=sc.nextInt();
        
       // int k1=binary1(arr,k);
       // System.out.println(k1+" "  +" herre it s");

        // right most element
      /* int k2=rightmost(arr,k);
        System.err.println("right most is"+" "+k2);
        */  

       /* int l2=leftmost(arr,k);
        System.out.println("leftmost element is"+" "+l2);
        */

        /*int lowerbound=lower(arr,k);
        System.err.println("enter left side lemnt"+" "+ lowerbound);
        */

        int upperbound=upper(arr,k);
        System.out.println("uppee elemt at pos"+" "+upperbound);
        


    }


    public static int upper(int[] arr,int tg)
    {
        int low=0,high=arr.length-1;
        
        while(low<=high)
        {
            int mid=low+(high-low)/2;

            if(arr[mid]>tg)
            {
                high=mid-1;
            }
            else 
                low=mid+1;
        }


        if(low==arr.length)
            return -1;
        else
        return low;
    }

         public static int lower(int[] arr,int tg)
    {
        int low=0,high=arr.length-1;
        
        while(low<=high)
        {
            int mid=low+(high-low)/2;

            if(arr[mid]>=tg)
            {
                high=mid-1;
            }
            else 
                low=mid+1;
        }


        if(low==arr.length)
            return -1;
        else
        return low;
    }



     public static int leftmost(int[] arr,int tg)
    {
        int low=0,high=arr.length-1;
        
        while(low<=high)
        {
            int mid=low+(high-low)/2;

            if(tg<=arr[mid])
            {
                high=mid-1;
            }
            else 
                low=mid+1;
        }


        if(low==arr.length)
            return -1;
        else
        return low;
    }

    public static int rightmost(int[] arr,int tg)
    {
        int low=0,high=arr.length-1;
        
        while(low<=high)
        {
            int mid=low+(high-low)/2;

            if(tg>=arr[mid])
            {
                low=mid+1;
            }
            else 
                high=mid-1;
        }


        if(high<0)
            return -1;
        else
        return high;
    }

    public static int binary1(int[] arr,int tg)
    {
        int low=0,high=arr.length-1
        ;
        int mid=0;
       // mid=low+(high-low)/2;
        while(low<=high)
        {
            mid=low+(high-low)/2;

            if(arr[mid]>tg)
            {
                high=mid-1;
            }
            else 
                low=mid+1;
            
        }
          if(low==arr.length)
            return -1;
         else 
            return low;
    }
}