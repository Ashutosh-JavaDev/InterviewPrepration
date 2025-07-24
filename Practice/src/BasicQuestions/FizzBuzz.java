package BasicQuestions;

import java.util.ArrayList;

public class FizzBuzz {
    public static ArrayList<String> result(int n) {
       ArrayList <String>list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%15==0){
               list.add("FizzBuzz");
            }
            else if(i%3==0){
                list.add("Buzz");
            }
            else if(i%5==0){
                list.add("Fizz");
            }
            else{
                list.add(list.get(i));
            }
        }
        return list;
    }
    public static void main(String[] args) {
        result(15);
    }
}
