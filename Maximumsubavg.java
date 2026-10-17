import java.util.*;

public class Maximumsubavg
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("enter the array elemnts");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("emter the sub ");
        int k=sc.nextInt();
        double sum=0;

    /*    for(int i=0;i<=n-k;i++)
        {
            int sum1=0;
            for(int j=i;j<i+k;j++)
            {
               sum1+=arr[j];
            }
            double avg=(double) sum1/k;

            sum=Math.max(avg,sum);
        }

        //System.out.println("max sub avg is %.2f"+" "+sum);
        System.out.printf("max sub avg is %.2f", sum);

        */ 

        double optimal=opti(arr,n,k);
        System.out.printf("max sum is %.2f",optimal);

    }

    public static double opti(int[] arr,int n,int k)
    {
        double sum1=0,sum2=0;
        int l=0;
        for(int i=0;i<n;i++)
        {
            sum2+=arr[i];
            if(i-l==k)
            {
                sum2-=arr[l];
                l++;

            }
            if(i-l+1==k)
            {
                double m2=(double) sum2/k;
               sum1=Math.max(sum1,m2);
            }

        }
        return sum1;
    }
}