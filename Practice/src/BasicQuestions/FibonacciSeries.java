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
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the list");
        int num=sc.nextInt();
        Sequence(num, 0, 1);
        System.out.println();
    }
}
