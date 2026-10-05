import java.util.*;
public class Eleonce
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.err.println("enter array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }



                System.out.println("single num is"+" "+findSingle(arr));


        for(int i=0;i<n;i++)
        {
           // boolean s1=true;
           int c=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                   c++;
                }

            }
            if(c==1)
            {
                System.err.println("elemnt once in array is "+" "+arr[i]);
                return;
            }
        }

    }
     
    
    public static int findSingle(int[] arr) 
    {
        int result = 0;
        for (int num : arr) {
            result ^= num;  // XOR all numbers
        }
        return result;
    }
}