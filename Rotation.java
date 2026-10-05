import java.util.*;

//import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
public class Rotation {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.err.println("enter array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
        System.err.println("enter no of raotaion u want");
        int rot=sc.nextInt();
      //  leftrotate(arr,rot,n);
        rightrotate(arr,rot,n);

    }
    public static void leftrotate(int[] arr,int rot,int n)
    {
        int[] ar2=new int[n];

        int res=rot%n;

        int j=0;
        for(int i=res;i<n;i++)
        {
            ar2[j]=arr[i];
            j++;
        }
        for(int k=0;k<res;k++)
        {
            ar2[j]=arr[k];
            j++;
        }
        System.out.println(Arrays.toString(ar2));


    }
    public static void rightrotate(int[] arr, int rot,int n)

    {
        int ar2[]=new int[n];
        int rs=rot%n;

        int k1=0;
        for(int i=rs;i<n;i++)
        {
            ar2[i]=arr[k1];
            k1++;
        }
        for(int i=0;i<rs;i++)
        {
            ar2[i]=arr[k1];
            k1++;
        }

      
        System.out.println(Arrays.toString(ar2));



    }
    
}


// Steps: reverse first rot → reverse rest → reverse whole
//reverse(arr, 0, rot - 1);
//reverse(arr, rot, n - 1);
//reverse(arr, 0, n - 1);


// Steps: reverse first rot → reverse rest → reverse whole
/* 🔹 Left Rotation (by rot steps)
reverse(arr, 0, rot - 1);
reverse(arr, rot, n - 1);
reverse(arr, 0, n - 1);
*/