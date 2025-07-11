package BasicQuestions;

public class removeSpace {
    
    public static  String remove(String  str){
        if(str.length()-1==0){
            return str;
        }
        else{
            str.trim();
            remove(str.substring(0, str.length()-1));
        }
        return str;
    }
}
