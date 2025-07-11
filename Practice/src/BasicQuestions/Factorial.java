package BasicQuestions;

public class Factorial {
    static int fact=1;
    public static  int fact(int num){
        if(num==1){
            return fact;
        }
        else{
            fact*=num;
            fact(num-1);
        }
        return fact;
    }
    public static void main(String[]args){
        int num=5;
        System.out.println(fact(num));
    }
}

