import java.util.*;
public class Fruitsintobaskets
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();

        int[] arr=new int[n];

        System.out.println("enter the array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("enter the sub u want");
        int k=sc.nextInt();

       // int better=bet(arr,n,k);
        //System.out.println("better is"+" "+better);

        int opti=optima(arr,n,k);
        System.err.println("the max basekets"+" "+opti);
       //  HashSet<Integer> h1=new HashSet<>();
       /*int max1=0;

       for(int i=0;i<n;i++)
       {
        HashSet<Integer> h1=new HashSet<>();
        for(int j=i;j<n;j++)
        {
           // if(h1.contains(arr[j]))
           h1.add(arr[j]);

           if(h1.size()>k)
           {
            break;
           }

           max1=Math.max(max1,j-i+1);

        }

       }
       System.err.println("the ax 2 baskets we store"+" "+max1);
       */

       

         




    }
    public static int bet(int[] arr,int n,int k)
    {
        int l=0,r=0,max1=0;

        HashMap<Integer,Integer>h1=new HashMap<>();

        while(r<arr.length)
        {
            
            h1.put(arr[r],h1.getOrDefault(arr[r],0)+1);

            while(h1.size()>k)
            {
                h1.put(arr[l],h1.get(arr[l])-1);
                if(h1.get(arr[l])==0)
                {
                    h1.remove(arr[l]);
                }
                l++;
            }
         max1=Math.max(r-l+1,max1);
         r++;


        }
        return max1;
    }
    public static int optima(int[] arr,int n,int k)
    {
        HashMap<Integer,Integer>h1=new HashMap<>();

        int l=0,r=0,max1=0;

        while(r<arr.length)
        {
            h1.put(arr[r],h1.getOrDefault(arr[r],0)+1);

            if(h1.size()>k)
            {
               h1.put(arr[l],h1.get(arr[l])-1);
               if(h1.get(arr[l])==0)
                h1.remove(arr[l]);
            l++; 
            }
            if(h1.size()<=k)
            {
                max1=Math.max(r-l+1,max1);
            }
            r++;
        }

        return max1;
    }
}