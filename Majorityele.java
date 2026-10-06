import java.util.*;
public class Majorityele
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();

        int[] arr=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }

        // using array
     /*   int max=0;
        int ele=-1;
        for(int i=0;i<n;i++)
        {
            int cnt=0;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    cnt++;
                    if(cnt>max)
                    {
                        max=cnt;
                         ele=arr[i];
                    }
                }
            }

        }
        System.out.println("most repeated ele is" + " "+ ele);
        */ 

        // using hashmap
       // System.out.println(hash(arr,n));
       // using moyyere booyyere
      System.out.println(moyre(arr,n));
    }

    public static int moyre(int[] arr,int n)
    {
        int candidate=0,count=0;
        for(int i=0;i<n;i++)
        {
            if(count==0)
            {
                candidate=arr[i];
                
            }
            if(candidate==arr[i])
                count++;
            else
                count--;
        }

          count = 0;

    for (int num : arr) {
        if (num == candidate) {
            count++;
        }
    }

    if (count > arr.length / 2) {
        return candidate;
    }

    return -1; // No majority element
    }
    public static int hash(int[] arr,int n)
    {
        HashMap<Integer,Integer>h1=new HashMap<>();
        for(int num:arr)
        {
            h1.put(num,h1.getOrDefault(num,0)+1);
        }
        int max=0;
        int key=0;
        for(Map.Entry<Integer,Integer>hm:h1.entrySet())
        {
            if(hm.getValue()>max)
            {
                max=hm.getValue();
                key=hm.getKey();
            }
        }
        //System.out.println("the most repeated is"+" "+key);
        return key;
    }
}