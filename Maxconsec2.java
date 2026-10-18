import java.util.*;
public class Maxconsec2 {


    public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);

    System.out.println("enter the size of array");

    int n=sc.nextInt();
    System.out.println("enter array elements");
    int arr[]=new int[n];

    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();

    }

    System.out.println("enter the size of it");
    int k=sc.nextInt();


    int better=bet(arr,n,k);

    System.out.println("better is"+ " "+ better);
  /* 

    for(int i=0;i<n;i++)
    {
        int cnt=0;
        for(int j=i;j<n;j++)
        {

            if(arr[j]==0)
                cnt++;

            if(cnt>k)
            {
                break;
            }

            max1=Math.max(j-i+1,max1);

        }

    }

    System.out.println("max is "+" "+max1);

    */

   } 

   public static int bet(int[] arr,int n,int k)
   {
    int max1=0,l=0,r=0,cnt=0;

    while(r<arr.length)
    {
        if(arr[r]==0)
            cnt++;

        while(cnt>k)
        {
            if(arr[l]==0)
                cnt--;

            l++;

        }

        max1=Math.max(r-l+1,max1);
        r++;

    }
    return max1;
  }
}
