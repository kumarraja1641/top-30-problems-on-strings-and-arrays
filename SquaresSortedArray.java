import java.util.*;
public class SquaresSortedArray {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter array elemnts");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
      //  int[] a1=sorted(arr);
       // System.err.println(Arrays.toString(a1));


       // optinmal way is

       int[] a2=twopoint(arr);
       System.out.println(Arrays.toString(a2));



    }

    public static int[] twopoint(int[] arr)
    {
        int n=arr.length;
        int i=0,j=n-1;
        int temp[]=new int[n];

        for(int id=n-1;id>=0;id--)
        {
            int max=Math.abs(arr[i]);
            int max2=Math.abs(arr[j]);
            if(max>=max2)
                {
                    temp[id]=max*max;
                    i++;
                }
                else
                {
                    temp[id]=max2*max2;
                    j--;

                }
            
        }
        return temp;
    }
    public static int[] sorted(int[] arr)
    {
        int n=arr.length;

        //Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            arr[i]=arr[i]*arr[i];
        }
        Arrays.sort(arr);
        return arr;



    }
    
}
