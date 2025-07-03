package BasicQuestions;
import java.util.Scanner;
public class reverseThestring {
   static String st="";
    public static String reverse(String str){
        if(str.length()==1){
            return str;
        }
        st+=str.charAt(str.length()-1);
      reverse(str.substring(0, str.length()-1));
      return st;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        String res=reverse(str);
        System.out.println(res);
    }
}
