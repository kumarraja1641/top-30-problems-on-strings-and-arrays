import java.util.*;
public class Missingnum {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        System.err.println("enter array elements");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
       // missing(arr);
    misxor(arr);

    }
    public static void missing(int[] arr)
    {
        int exp=arr.length+1;
        exp=exp*(exp+1)/2;
        int s=0;
        for(int num:arr)
            s+=num;

        int missing=exp-s;
        System.out.println("missing number is"+" "+missing);

    }
    public static void misxor(int[] arr)
    {
        int xor=0;
        for(int i=1;i<=arr.length+1;i++)
        {
            xor=xor^i;
        }
        for(int num:arr)
        {
            xor=xor^num;
        }
        System.out.println("missing num is"+" "+xor);

    }
    
}
