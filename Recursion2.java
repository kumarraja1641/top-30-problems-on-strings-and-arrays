import java.util.*;
public class Recursion2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
       // int n=sc.nextInt();

      /*  int k=fact(n);
        System.out.println("factorial is "+k);
        */ 
      //  int sum=sum1(n);
       // System.out.println("sum of digits is "+ sum);

       /*int k=reverse(n,0);
       System.out.println("reverse of num is"+ k);
       */
       int n=sc.nextInt();
        sc.nextLine();
        System.out.println("enter a string");
        String s2=sc.nextLine();

        String ss=remove(s2);
        System.out.println(ss);

        /* 
       String s1=sc.nextLine();


       boolean ispalim=palim(s1,0,s1.length()-1);
       if(!ispalim)
       {
        System.out.println("is not palimdrome");
       }
       else
       {
        System.out.println("plimdrome");
       }
        */

    }
    public static String remove(String s2)
    {
        if(s2.length()<=1)
            return s2;

        if(s2.charAt(0)!=s2.charAt(1))
            return remove(s2.substring(1));
        
        return s2.charAt(0) + remove(s2.substring(1));

    }

    public static boolean palim(String s1,int i,int j)
    {
        while(i<j)
        {
            if(s1.charAt(i)!=s1.charAt(j))
                return false;

            i++;
            j--;
        }
        return true;

    }
    public static int reverse(int n,int rev)
    {
        if(n==0)
            return rev;
        return reverse(n/10,rev*10 + n%10);
    }
   
    public static int sum1(int n)
    {
        if(n==0)
            return 0;
        return n%10+sum1(n/10);
    }
}

