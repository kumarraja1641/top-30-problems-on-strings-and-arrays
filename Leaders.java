import java.util.*;
public class Leaders
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        List<Integer>l1=new LinkedList<>();
        if(n==0)
            return;

        if(n==1)
        {
            System.out.println(arr[0]);
            return;
        }
        else
        {
            l1.add(arr[n-1]);

            int gre=0;
            int pre=arr[n-1];
            for(int i=n-2;i>=0;i--)
            {
                if(arr[i]>pre)
                {
                     l1.add(arr[i]);
                    pre=arr[i];
                   
                }
            }
        }
        System.out.println("leaderos of array is"+" "+l1);



    }
}