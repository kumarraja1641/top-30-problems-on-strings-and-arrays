import java.util.*;
public class Extension {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s1=sc.nextLine();
        int len=s1.length();
        for(int i=0;i<len;i++)
        {
            char ch=s1.charAt(i);
            if(ch=='.')
            {
                //System.out.println("")
                System.out.println(s1.substring(i,len));
                return;
            }
        }
    }
    
}
