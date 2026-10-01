import java.util.*;
public class Secondlargest {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the array:");
        n=sc.nextInt();
        if(n<=1) {
            System.out.println("Array size must be greater than 1");
            return;
        }
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int secondLargest=secondlargest(arr,n);
        System.out.println("Second largest array element is"+" "+secondLargest);
    }

    public static int secondlargest(int arr[],int n)
    {
        int largest=arr[0];
        int second=arr[1];

        for(int i=1;i<n;i++)
        {
            if(arr[i]>largest)
            {
                second=largest;
                largest=arr[i];
            }
              else if(arr[i]>second && arr[i]!=largest)
              {
                  second=arr[i];
              }
        }
        return second;
    }
}