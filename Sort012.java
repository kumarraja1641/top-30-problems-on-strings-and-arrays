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

        optimal(arr,n);







        /*

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
    */
 }

 public static void optimal(int[] arr,int n)
 {
    int low=0,mid=0,high=arr.length-1;
    while(mid<=high)
    {
        if(arr[mid]==0)
        {
            int temp=arr[low];
            arr[low]=arr[mid];
            arr[mid]=temp;
            mid++;
            low++;


        }
        else if(arr[mid]==1)
        {
            mid++;
        }
        else
        {
            int temp=arr[high];
            arr[high]=arr[mid];
            arr[mid]=temp;
            high--;


        }
    }
    System.err.println(Arrays.toString(arr));

 }
  
}
