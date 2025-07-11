package BasicQuestions;
import java.util.Scanner;
public class checkStringPalindrome {
    static boolean res = false;
    static String st = "";

    public static boolean check(String str) {
        if (str.length() == 0) {
            return res;
        } else {
            st += str.charAt(str.length() - 1);
            check(str.substring(0, str.length() - 1));
        }
        if (str.equalsIgnoreCase(st)) {
            res = true;
        } else {
            res = false;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        boolean res = check(str);
        System.out.println(res);
    }
}
