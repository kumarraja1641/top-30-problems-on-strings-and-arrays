import java.util.*;
public class FindDuplicate {
    public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
//c
  System.out.println("enter a size of array");
  int n=sc.nextInt();
  System.err.println("enter aaray aelements");
  int[] arr=new int[n];
  for(int i=0;i<n;i++)
  {
    arr[i]=sc.nextInt();

  }

  for(int i=0;i<n;i++)
  {
    for(int j=i+1;j<n;j++)
    {
        if(arr[i]==arr[j])
        {
            System.out.println("duplicate elemnt found"+" "+arr[i]);
            break;
        }
    }
  }
  // using method 
  method(arr,n);


}
public static void method(int[] arr,int n)
{
    int index=0;
    for(int i=0;i<n;i++)
    {
        index=Math.abs(arr[i]);
        if(arr[index]<0)
        {
            System.out.println("duplicatre found that"+" "+index);
            break;
        }
        else
        {
            arr[index]=-arr[index];
        }

    }
}
    
}
