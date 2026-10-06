import java.util.*;
public class RemoveSpaces {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s1=sc.nextLine();

        String s2="";
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            if(ch==' ')
            {
               // s2+="";

            }
            else
            {
                s2+=ch;
            }
        }
        System.out.println(s2);
    }
    
}
