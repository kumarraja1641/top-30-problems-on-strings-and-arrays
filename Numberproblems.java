import java.util.*;
public class Numberproblems
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();


       
        //boolean luck=lucky(n);

       /*  if(luck)
        {
            System.out.println("lucky number");
        }
        else
        {
            System.out.println("not lucky number");
        }
            */
      /*  boolean b1=happy(n);
        if(!b1)
        {
            System.err.println("not happy number");

        }
        else
        {
            System.out.println("happy number");
        }
            */ 


        /*boolean isarm=armstrong(n);
         if(isarm)
         {
            System.err.println("armstrong");
         }
         else
         {
            System.out.println("not armstrong");
         }
            
       */
      /* 
      if(isprime)
      {
        System.out.println("prime number");
      }
      else
      {
        System.out.println("not prime number");
      }
     */

     // perfect(n);
     // strong(n);
     //automorphic(n);
     //  harshad(n);
      //neon(n);
      //spy(n);
      //duck(n);

    //  primeupton(n);
     // firstnprime(n);
     int k=sc.nextInt();
     primerange(n,k);

    }

    public static void primerange(int n,int k)
    {
        for(int i=n;i<k;i++)
        {
            boolean s1=prime(i);
            if(s1)
                System.out.print(i+" ");
        }

    }
    public static void firstnprime(int n)
    {
        boolean s1=true;
        int c=0;
        int i=1;
        while(c<n)
        {
            
                boolean f1=prime(i);
                if(f1)
                {
                    c++;
                    System.out.print(i+" ");
                }



            i++;
           

        }
    }
    public static void primeupton(int n)
    {
        int c=0;
        List<Integer>l1=new ArrayList<Integer>();
        for(int i=1;i<n;i++)
        {
            
           // while()
           boolean s1=prime(i);
           if(s1)
           {
            System.out.print(i+" ");
            l1.add(i);
           }


        }
        System.out.println(l1);;
    }
    public static void duck(int n)
    {
        String s1=String.valueOf(n);

        int k1=Integer.parseInt(s1);
        boolean s3=false;;

        while(k1>0)
        {
            int rev=k1%10;
            if(rev==0)
                s3=true;

            k1=k1/10;

            

        }
        if(s3)
        {
            System.out.println("true of duck");
        }
        else
        {
            System.out.println("not duck");
        }
    }
    public static void spy(int n)
    {


        int psum=1,numsum=0;
        while(n>0)
        {
            int rev=n%10;
            psum*=rev;
            numsum+=rev;
            n=n/10;
        }
        if(psum==numsum)
        {
            System.out.println("is spy number");
        }
        else
        {
            System.out.println("not spy num");
        }
        }
    public static void neon(int n)
    {

        //int c=0;
        int temp=n;
        int sq=n*n;
        int c=0;
        while(sq>0)
        {
            c+=sq%10;
            sq/=10;

        }
        if(temp==c)
        {
            System.out.println("neon");
        }
        else
        {
            System.out.println("not neon");
        }
    }

    public static void harshad(int n)
    {

        int c=0;
        int temp=n;
        while(n>0)
        {
            c+=n%10;
            n=n/10;
        }
        if(temp%c==0)
        {
            System.out.println("harshad");
        }
        else
        {
            System.out.println("not harshad");
        }
    }

    public static void automorphic(int n)
    {
        int trmp=n;
        int sum=n*n;
        boolean flag=true;

        while(n>0 && sum>0)
        {
            if(n%10!=sum%10)
            {
                flag=false;
                break;
            }
            n=n/10;
            sum=sum/10;


        }
        if(flag)
        {
            System.out.println("automorphic num");
        }
        else
        {
            System.err.println("not automorphic");
        }

    }
    public static void strong(int n)
    {
        int temp=n;
        int sum=0;
          while(n>0)
          {
            int k=n%10;
            sum+=fact(k);
            n=n/10;
            
          }
          if(sum==temp)
            System.err.println("strong num");
        else
            System.out.println("not strong number");
    }
    public static int fact(int n)
    {
        int c=1;
        for(int i=n;i>=2;i--)
        {
            c*=i;
        }
        return c;
    }
    public static void perfect(int n)
    {
        int c=1;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                c=c+i;
                int pair=n/i;
                if(pair!=i)
                    c+=pair;
            }
            
                
        }
        if(c==n)
        {
            System.out.println("perfect number");
        }
        else
        {
            System.out.println("not perfect");
        }

    }
    public static boolean prime(int n)
    {
        if(n==1)
            return false;
        if(n==3 || n==2 || n==5)
            return true;
      //  int cnt=0;

     /*   for(int i=2;i<n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
         */

        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
                return false;
        }

        return true;
        
       /*for(int i=5;i*i<n;i+=6)
       {
        if(n%i==0 || n%(i+2)==0)
            return true;
       }
    

          return true;
          */


    }

    public static boolean armstrong(int n)
    {
        int c=0;
        int sum=0;
        int temp=n;
        while(n>0)
            {
                c=c+1;
                n/=10;
            } 

            n=temp;
            while(n>0)
            {
                int rev=n%10;
                sum+=(int) Math.pow(rev,c);
                n=n/10;

            }
            if(temp==sum)
                return true;
            else
                return false;


    }
    public static boolean isluckily(int n,int cnt)
    {
        if(n%2==0)
            return false;
        if(cnt>n)
            return true;
        n=n-(n/cnt);
        return isluckily(n,cnt+1);

    }

    public static boolean lucky(int n)
    {
             return isluckily(n,2);




    }
    public static boolean happy(int n)
    {
        HashSet<Integer>h1=new HashSet<>();

        //h1.add(n);
      
        while(!h1.contains(n))
        {
            h1.add(n);
            int sum=n;
            n=0;
            while(sum>0)
            {
                int r=sum%10;
                n+=r*r;
                sum=sum/10;

            }

            if(n==1)
                return true;
        }
        return false;
    }
}