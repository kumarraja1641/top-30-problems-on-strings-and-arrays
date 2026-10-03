import java.util.*;
public class Removeduparr {
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
        //removedup(arr,n);
        //remove(arr,n);
        point2(arr,n);


    }
    public static void remove(int[] arr,int n)
    {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            boolean flag=true;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            {
                list.add(arr[i]);
            }
        }
        System.out.println("The elements in the array after arraylist removing duplicates are:");
        for(int num:list)
        {
            System.out.print(num+" ");
        }
    }


    public static void removedup(int[] arr,int n)
    {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            set.add(arr[i]);
        }
        System.out.println("The elements in the array after removing duplicates are:");
        for(int num:set)
        {
            System.out.print(num+" ");
        }
    }
    //using 2 pointers 
    public static void point2(int[] arr,int n)
    {
        Arrays.sort(arr);
        int j=0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]!=arr[j])
            {
                j++;
                arr[j]=arr[i];
            }
        }
      
        System.out.println("The elements in the array after removing duplicates using 2 pointers are:");
        for(int i=0;i<j;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

}
