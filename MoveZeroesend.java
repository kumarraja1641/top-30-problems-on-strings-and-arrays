import java.util.*;
public class MoveZeroesend {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the array");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
      //  movezeroes(arr,n);
        ponter2(arr,n);
    }

   public static void ponter2(int[] arr,int n)
    {
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        System.out.println("The elements in the array after moving zeros to the end are:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void movezeroes(int[] arr,int n)
    {
        int cn=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                cn++;

            }
        }
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                arr[j]=arr[i];
                j++;
            }
        }
        while(j<n)
        {
            arr[j]=0;
            j++;
        }
        System.out.println("The elements in the array after moving zeros to the end are:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
