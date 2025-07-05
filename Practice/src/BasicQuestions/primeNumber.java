package BasicQuestions;

public class primeNumber {
    static boolean res = false;
    static int value = 0;

    public static boolean count(int num, int i) {
        if (i == num) {
            return true;
        } else {
            if (num % i == 0) {
                value++;
            }
        }
    }
}
