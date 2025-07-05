package BasicQuestions;

public class primeNumber {
    static boolean res = false;
    static int value = 0;

    public static boolean count(int num, int i) {
        if (i == num) {
            return res;
        } else {
            if (num % i == 0) {
                value++;
            }
            count(num, i+1);
        }
        if(value==2){
            res=true;
        }
        else{
            res=false;
        }
        return res;
    }
}
