import java.util.*;
public class Panagram {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s1=sc.nextLine();
        s1=s1.toLowerCase();
        s1=s1.replaceAll(" ","a");
       //char ch='a';
      //  boolean b1=true;
    //  boolean s11=true;
        boolean[] seen = new boolean[26];

        // mark letters
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                seen[ch - 'a'] = true;
            }
        }

        // check if all 26 letters are seen
        boolean isPangram = true;
        for (boolean b : seen) {
            if (!b) {
                isPangram = false;
                break;
            }
        }

        if (isPangram) {
            System.out.println("pangram");
        } else {
            System.out.println("not pangram");
        }
    }
    
}
