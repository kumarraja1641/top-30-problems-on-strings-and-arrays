import java.util.*;
public class Matrixintermediate {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.err.println("enter roe and column of magteix");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];

        System.err.println("enter array elemts");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();

            }
        }
        /* 

        int[][] a2=new int[m][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a2[j][i]=arr[i][j];
            }
        }

        System.out.println(Arrays.deepToString(a2));
        */

      //  reverserow(arr);
      //  searchele(arr,7);
     //  rotate90(arr);
       // System.err.println( );
       setmatrix0(arr);
    }

    public static void setmatrix0(int [][]arr)
    {
        int[] row=new int[arr.length];
        int col[]=new int[arr[0].length];
        int n=arr.length;

        for(int i = 0; i < arr.length; i++)
         {
          for(int j = 0; j < arr[i].length; j++)
             {
        if(arr[i][j] == 0)
        {
            row[i] = 1;
            col[j] = 1;
        }
         }
         }


         for(int i=0;i<n;i++)
         {
            for(int j=0;j<arr[i].length;j++)
            {
                if(row[i]==1 || col[j]==1)
                {
                    arr[i][j]=0;
                }
            }
         }
         System.out.println(Arrays.deepToString(arr));



        //for(int i=0;i<)

    }

    public static void rotate90(int[][] arr)


    {

        int n=arr.length;
        int m=arr[0].length;
        int[][] arr2=new int[n][m];

        for(int i=-0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr2[i][j]=arr[j][i];
            }
        }
        System.err.println("transpose is"+Arrays.deepToString(arr2));

        for(int i=0;i<n;i++)
        {
            int k=0;
            for(int j=arr[i].length-1;j>=0;j--)
            {
                arr[i][k]=arr2[i][j];
                k++;
            }

        }
        System.out.println("rotate of 90 "+ " "+ Arrays.deepToString(arr));
    }

    public static void searchele(int[][] arr,int k)
    {
        int tg=k;
        boolean f1=false;
        int n=arr.length;
       
       int z=0,x=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]==tg)
                {
                    f1=true;
                    z=j;x=i;
                    break;
                }
            }
        }
        if(f1)
        {
            System.err.println("elenta at "+" "+x+" "+z);
        }
        else
        {
            System.err.println("elemnt not found");
        }
    }

    public static void reverserow(int[][] arr)
    {
        int m2[][]=new int[arr.length][arr[0].length];

        for(int i=0;i<arr.length;i++)
        {
            int k=0;
            for(int j=arr[i].length-1;j>=0;j--)
            {
                m2[i][k]=arr[i][j];;
                k++;

            }
        }
        System.out.println(Arrays.deepToString(m2));
    }
    
}
