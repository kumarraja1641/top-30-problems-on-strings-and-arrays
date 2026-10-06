import java.util.*;
public class Twosum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter the size of array");
        n=sc.nextInt();

        System.err.println("enter array elemnts");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("enter the sum you want");
        int s=sc.nextInt();
       // int[] ar2=tosum(arr,n,s);
       // System.out.println(Arrays.toString(ar2));

        // using hashmap
        int[] a1=map(arr,n,s);
        System.err.println(Arrays.toString(a1));
    }
    public static int[] tosum(int[] arr,int n,int sum)
    {
       // int ts=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==sum)
                    return new int[] {arr[i],arr[j]};

            }
        }
        return new int[] {-1,-1};
    }
    public static int[] map(int[] arr,int n,int s)
    {
        HashMap<Integer,Integer>h1=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            //if(!h1.containsKey(arr[i]))
            int comp=s-arr[i];

            if(h1.containsKey(comp))
            {
                return new int[]{comp,arr[i]};
            }

            h1.put(arr[i],i);


        }
        return new int[]{-1,-1};

    }
}