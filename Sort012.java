import java.util.*;
public class Sort012 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.err.println("enter array elemnts");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();;
        }

        int c0=0;
        int c1=0;
        int c2=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
                c0++;
            else if(arr[i]==1)
                c1++;
            else
                c2++;
        }
        for(int i=0;i<c0;i++)
        {
            arr[i]=0;
        }
        for(int j=c0;j<c0+c1;j++)
        {
            arr[j]=1;
        }

        for(int k=c0+c1;k<n;k++)
        {
            arr[k]=2;
        }

        System.out.println(Arrays.toString(arr));
    }
  
}
