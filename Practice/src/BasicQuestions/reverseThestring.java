package BasicQuestions;
import java.util.Scanner;
public class reverseThestring {
   static String st="";
    public static String reverse(String str){
        if(str.length()<=1){
            return str;
        }
        st+=str.charAt(str.length()-1);
      reverse(str.substring(0, str.length()-1));
      return st;
    }
    
}
