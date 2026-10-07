import java.util.*;

public class LongestCommomsequence {
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
        HashSet<Integer>h1=new HashSet<>();
        for(int num: arr)
        {
            h1.add(num);
        }
        int longest=0;
        int streak=0;
        for(int num:arr)
        {
            if(!h1.contains(num-1))
            {
                int cnum=num;
                streak=1;

                while(h1.contains(cnum+1))
                {
                    streak++;
                    cnum++;
                }

            }
            longest=Math.max(streak,longest);

        }
        System.err.println("longest sequence is"+ " "+ longest);


        //listsequence(arr,n);
        optimal(arr,n);
    }
    public static void listsequence(int[] arr,int n)
    {
        List<Integer> a1=new LinkedList<>();
        HashSet<Integer> h1=new HashSet<>();
        for(int num:arr)
        {
            h1.add(num);
        }
        int streak=0,longest=0;
        for(int num:arr)
        {
          if(!h1.contains(num-1))
            {
                streak=1;
                int cnum=num;
                List<Integer> l1=new LinkedList<>();
                l1.add(num);

                while(h1.contains(cnum+1))
                {
                    streak++;
                    cnum++;
                    l1.add(cnum);
                }
                if(l1.size()>longest)
                {
                    longest=l1.size();
                    a1=l1;
                }
                




            }  
        }

        System.err.println("longestsequence is"+" "+a1.size()+" "+a1);

    }
    public static void optimal(int[] arr,int n)
    {
         Set<Integer> set = new HashSet<>();
        for (int num : arr) set.add(num);





        int longest = 0;
        int bestStart = 0;  // store starting number of best sequence

        for (int num : set) {
            // only start if it's the beginning of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int streak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    streak++;
                }

                if (streak > longest) {
                    longest = streak;
                    bestStart = num; // record the start of this best sequence
                }
            }
        }

        // reconstruct the best sequence
        List<Integer> bestSequence = new ArrayList<>();
        for (int i = 0; i < longest; i++) {
            bestSequence.add(bestStart + i);
        }
       


    }
}
