import java.util.*;

public class Matrix
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);

      System.out.println("enter rows and cloumns");
      int n=sc.nextInt();
      int m=sc.nextInt();


      int[][] arr=new int[n][m];

      int[][] arr2=new int[n][m];

      for(int i=0;i<n;i++)
      {
        for(int j=0;j<arr[i].length;j++)
        {
            arr[i][j]=sc.nextInt();
        }
      }
      System.err.println("enter second matrix elemnts");

      
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<arr[i].length;j++)
        {
            arr2[i][j]=sc.nextInt();
        }
      }
     // int res
    // add(arr,arr2);
    // sub(arr,arr2);

     multi();



    }

    public static void add(int[][] arr,int[][] arr2)
    {
        // additiomn is 

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=arr[i][j]+arr2[i][j];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr));

        
    }

    public static void sub(int[][] arr,int[][] arr2)
    {
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=arr[i][j]-arr2[i][j];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr));


    }

    public static void multi()
    {



      Scanner sc=new Scanner(System.in);
      System.out.println("enter rows and cloumns 1st matrix");
      int n=sc.nextInt();
      int m=sc.nextInt();

      int[][] arr1=new int[n][m];

      System.err.println("enter 1st matrix elemnts");
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<m;j++)
        {
            arr1[i][j]=sc.nextInt();
        }
      }

      System.out.println("enter rows and cloumns 2nd matrix");

      int n2=sc.nextInt();
      int m2=sc.nextInt();

      System.out.println("enter secomnd matrix elemnts");
      int[][] arr2=new int[n2][m2];

        for(int i=0;i<n2;i++)
      {
        for(int j=0;j<m2;j++)
        {
            arr2[i][j]=sc.nextInt();
        }
      }

      if(m!=n2)
      {
        System.err.println("not possible");
      }
      else
      {
        int[][] m3=new int[n][m2];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m2;j++)
            {
                for(int k=0;k<m;k++)
                {
                    m3[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(m3));
      }










    }
}