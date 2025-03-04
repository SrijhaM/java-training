import java.util.Scanner;
class Substr_obj
{
    public static void main(String args[])
    {
        String s1 = "Srijha";
        String s = s1.substring(2);
        System.out.println("Substring of String: " +s);
        StringBuilder sb = new StringBuilder(s1);
        String sbstr  = sb.substring(2);
        System.out.println("Substring of StringBuilder is: " +sbstr);
        StringBuffer a = new StringBuffer(s1);
        System.out.println("Substring of StringBuffer is: "+s1.substring(2));
    }
}
