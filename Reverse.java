import java.util.*;
public class Reverse {
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
    System.out.println("The reversed array is:");
    for(int i=n-1;i>=0;i--)
    {
        System.out.print(arr[i]+" ");
    }

    rev(arr,n);
  }
  public static void rev(int[] arr,int n)
  {
    int i=0,j=n-1,temp;
    while(i<j)
    {
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
    }
    System.out.println("\nThe reversed array using function is:");
    System.out.println(Arrays.toString(arr));
  }
}