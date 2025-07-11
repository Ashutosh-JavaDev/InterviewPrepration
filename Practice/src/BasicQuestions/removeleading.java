package BasicQuestions;
import java.util.Scanner;
public class removeleading {
    public static String check(String str){
       return str.trim();
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence with leaving some extra Space at the Starting");
        String str=sc.nextLine();
        String st=check(str);
        System.out.println(st);
    }
}
