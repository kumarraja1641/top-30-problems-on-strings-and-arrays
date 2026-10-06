import java.util.*;
public class FindUnion
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 2 sizes of array");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int arr[]=new int[n1];
        int arr2[]=new int[n2];

        System.out.println("enter the array elemnts");
        for(int i=0;i<n1;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n2;j++)
        {
            arr2[j]=sc.nextInt();
        }

        // using hashset

       /*  HashSet<Integer> h1=new HashSet<>();
        for(int i=0;i<n1;i++)
        {
            h1.add(arr[i]);
        }
        for(int j=0;j<n2;j++)
        {
            h1.add(arr2[j]);
        }

        System.out.println("union of array elemnts"+" "+ h1);

        */

        union(arr,arr2);

    }

    public static void union(int[] arr,int[] arr2)
    {
        List<Integer>l1=new ArrayList<>();

        for(int i=0;i<arr.length;i++)
        {
            if(!l1.contains(arr[i]))
            {
                l1.add(arr[i]);
            }
        }
        
        for(int i=0;i<arr2.length;i++)
        {
            if(!l1.contains(arr2[i]))
            {
                l1.add(arr2[i]);
            }
        }

        System.out.println("union of 2 arrays are"+" "+l1);
         

        int[] union=new int[l1.size()];

        for(int i=0;i<l1.size();i++)
        {
            union[i]=l1.get(i);

        }
        System.out.println(Arrays.toString(union));

    }
}