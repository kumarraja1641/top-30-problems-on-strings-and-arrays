import java.util.*;
public class RemoveSpecialChar {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s1=sc.nextLine();
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);

            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9'))
            {
                sb.append(ch);

            }
            else
            {

            }
        }
        System.out.println(sb);

    }
    
}
