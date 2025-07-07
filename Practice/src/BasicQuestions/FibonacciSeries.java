package BasicQuestions;

import java.util.Scanner;

public class FibonacciSeries {

    public static void Sequence(int num, int a, int b) {
        if (num<0) {
            return;
        } else {
            int c=a+b;
            Sequence(num, b, c);
            System.out.print(c +" ");
        }
    }
}
