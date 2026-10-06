import java.util.*;
public class Intersection {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of 2 array");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int arr[]=new int[n1];
        int arr2[]=new int[n2];

        System.out.println("enter array elemnts");
        for(int i=0;i<n1;i++)
        {
            arr[i]=sc.nextInt();

        }
        for(int j=0;j<n2;j++)
        {
            arr2[j]=sc.nextInt();
        }

        HashSet<Integer> h1=new HashSet<>();
        for(int i=0;i<n1;i++)
        {
            h1.add(arr[i]);
        }
        HashSet<Integer> h2=new HashSet<>();
        for(int i=0;i<n1;i++)
        {
            h2.add(arr2[i]);
        }
        for(int i=0;i<n1;i++)
        {
            int k=arr[i];
            if(h1.contains(k) && h2.contains(k))
            {
                System.err.print(k+" ");
            }
        }
    }
    
}
