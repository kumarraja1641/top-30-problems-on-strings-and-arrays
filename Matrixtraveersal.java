import java.util.*;
public class Matrixtraveersal
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.err.println("enter rows and columns");
        int n=sc.nextInt();
        int m=sc.nextInt();

        int[][] arr=new int[n][m];
        System.err.println("enter array elements");

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        /* 
        List<Integer>l1=new ArrayList<>();

        int rows=arr.length,cols=arr[0].length;

        for(int i=0;i<m;i++)
        {

            l1.add(arr[0][i]);
        }
        for(int i=1;i<rows;i++)
        {
            l1.add(arr[i][cols-1]);

        }

        if(rows>1)
        {
            for(int j=cols-2;j>=0;j--)
            {
                 l1.add(arr[rows-1][j]);
            }
        }
        if(cols>1)
        {
            for(int i=rows-2;i>=1;i--)
            {
                l1.add(arr[i][0]);
            }
        }
        System.err.println(l1);
        */

        //wavetraveersal(arr);
        diagnaltraversal(arr);
    }

    public static void diagnaltraversal(int[][] arr)
    {
        int row=arr.length;
        int cols=arr[0].length;
        

        for(int d=0;d<row+cols-1;d++)
        {
            for(int i=0;i<row;i++)
            {
                int j=d-i;
                if(j>=0 && j<cols)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }

    }

    public static void wavetraveersal(int[][] arr)
    {

        int row=arr.length;
        int cols=arr[0].length;
        List<Integer>l1=new ArrayList<>();


        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<cols;j++)
                {
                    l1.add(arr[i][j]);
                }
            }
            else{
                for(int j=cols-1;j>=0;j--)
                {
                    l1.add(arr[i][j]);
                }
            }
        }
        System.out.println(l1);

        List<Integer>l2=new ArrayList<>();
         for(int i=0;i<arr[0].length;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<row;j++)
                {
                    l2.add(arr[j][i]);
                }
            }
            else{
                for(int j=row-1;j>=0;j--)
                {
                    l2.add(arr[j][i]);
                }
            }
        }
        System.out.println(l2);

    }
}
