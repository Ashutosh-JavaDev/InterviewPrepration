package BasicQuestions;
import java.util.ArrayList;
public class CheckOdd {
    static boolean res=false;
    static int count=0;
    public static boolean check(ArrayList<Integer>list,int index){
        if(index==0){
            return res;
        }
        else{
            if(list.get(list.size()-1)%2!=0){
              res=true;
                check(list,index-1);
            }
            else{
                check(list, index-1);
                return false;
            }
        }
        return res;
    }
    public static void main(String[]args){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(12);
    }
}
