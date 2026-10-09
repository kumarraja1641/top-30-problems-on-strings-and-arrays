import java.util.*;
public class ThreeSum
{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter array elemnts");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the sum");
        int sum=sc.nextInt();

        Set<List<Integer>>but=brutee(arr,n,sum);
      /*  System.err.println(but);

        for(List<Integer> l1:but)
        {
            System.err.println(l1+" ");
        }

        // using iterator
        Iterator<List<Integer>> k1=but.iterator();
        while(k1.hasNext())
        {
            List<Integer> l2=k1.next();
            System.out.println(l2);

        }
        for(List<Integer> ll:but)
        {
            for(int num:ll)
            {
                System.err.print(num+" ");
            }
            System.err.println();
        }
            */ 


        List<List<Integer>> b1=better(arr,n,sum);
        System.out.println(b1);

    }

    public static List<List<Integer>> better(int[] arr,int n,int sum)
    {
        //List<List<Integer>>l2=new ArrayList<>();
        Set<List<Integer>> l2=new HashSet<>();

        for(int i=0;i<n-1;i++)
        {
            HashSet<Integer>h1=new HashSet<>();
            for(int j=i+1;j<n;j++)
            {
                int k=sum-(arr[i]+arr[j]);
                if(h1.contains(k))
                {
                    ArrayList<Integer> a1=new ArrayList<>();
                  a1.add(arr[i]);
                  a1.add(arr[j]);
                  a1.add(k);
                  Collections.sort(a1);
                  l2.add(a1);
                }

                h1.add(arr[j]);
            }
        }
        return new ArrayList<>(l2);
    }

        public static Set<List<Integer>> brutee(int[] arr, int n,int sum) 
            {
                Set<List<Integer>> h1=new HashSet<>();
                        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == sum) {
                        List<Integer> l1 = new ArrayList<>();
                        l1.add(arr[i]);
                        l1.add(arr[j]);
                        l1.add(arr[k]);
                        Collections.sort(l1);  //  correct usage
                        h1.add(l1);
                    }

                }
            }
        }
        return h1;
    }


             

 }


    