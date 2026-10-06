import java.util.*;
public class Toggle {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s1=sc.nextLine();
        String s2="";
       /*  for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            if(ch>='a' && ch<='z')
            {
                char ch2= (char)(ch-32);
                s2+=ch2;
            }
            else if(ch>='A' && ch<='Z')
            {
                char cg=(char)(ch+32);
                s2+=cg;
            }
            else
            {
                s2+=ch;

            }
        }
        System.out.println("toggles of characters in string is"+" " +s2);
        */

        // 2nd way is Character.t

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            if(Character.isLowerCase(ch))
            {
                sb.append(Character.toUpperCase(ch));
            }
            else if(Character.isUpperCase(ch))
            {
                sb.append(Character.toLowerCase(ch));
            }
            else
            {
                sb.append(ch);
            }
          
        }
        System.out.println(sb);

    }
    
}
