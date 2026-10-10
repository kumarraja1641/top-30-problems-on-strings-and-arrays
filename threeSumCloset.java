import java.util.*;
public class threeSumCloset {
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter array size");
    int n=sc.nextInt();
    int []arr=new int[n];
    System.out.println("enter array elements");
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }

    System.out.println("enter the target");

    int tg=sc.nextInt();

   // int close=Threesum(arr,n,tg);

  //  System.out.println("the closest value is"+" "+close);


     int optimal=Threesuum(arr,n,tg);
     System.err.println( optimal);








   }
   public static int Threesuum(int[] arr, int n ,int tg)
   {
    Arrays.sort(arr);
         int gap=Integer.MAX_VALUE;
         int cs=0;
         for(int i=0;i<n-2;i++)
         {
            int j=i+1;
            int k=arr.length-1;
            while(j<k)
            { 
                int sum=arr[i]+arr[j]+arr[k];
                if(sum>tg)
                {
                    if(gap>sum-tg)
                    {
                        gap=sum-tg;
                        cs=sum;
                    }
                    k--;
                }
                else if(sum<tg)
                {
                    if(gap>tg-sum)
                    {
                        gap=tg-sum;
                        cs=sum;
                    }
                    j++;
                }
                else
                {
                    return sum;
                }
            }

                



            }
            return cs;

         }
   


   public static int Threesum(int[] arr, int n,int tg)
   {
    int gap=Integer.MAX_VALUE;
    int cs=0;
    for(int i=0;i<n-2;i++)
    {
        for(int j=i+1;j<n-1;j++)
        {
            for(int k=j+1;k<n;k++)
            {
                int sum=arr[i]+arr[j]+arr[k];

                if(sum>tg)
                {
                    if(gap>sum-tg)
                    {
                        gap=sum-tg;
                        cs=sum;
                    }

                }
                else if(sum<tg)
                {
                    if(gap>tg-sum)
                    {
                        gap=tg-sum;
                        cs=sum;
                    }
                }
                else
                {
                    return sum;
                }
            }
          

        }
      }

          return cs;
    }



}

/*

import java.util.*;

public class threeSumCloset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target");
        int tg = sc.nextInt();

        int close = Threesum(arr, n, tg);

        System.out.println("The closest value is " + close);
    }

    public static int Threesum(int[] arr, int n, int tg) {
        if (n < 3) {
            throw new IllegalArgumentException(
                "Array must contain at least 3 elements"
            );
        }

        int gap = Integer.MAX_VALUE;
        int cs = arr[0] + arr[1] + arr[2];

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {

                    int sum = arr[i] + arr[j] + arr[k];
                    int diff = Math.abs(sum - tg);

                    if (diff < gap) {
                        gap = diff;
                        cs = sum;
                    }

                    if (sum == tg) {
                        return sum;
                    }
                }
            }
        }

        return cs;
    }
}



*/