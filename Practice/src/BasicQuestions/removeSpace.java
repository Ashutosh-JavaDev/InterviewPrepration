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
    public static void main(String[]args){
        String str="Jay Shree Ran";
        String st=remove(str);
        System.out.println(st);
    }
}
