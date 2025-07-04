package BasicQuestions;

import java.util.Scanner;

public class swapWithoutvariable {
    public static void swapping(int a, int b) {
        System.out.println("Before A: " + a);
        System.out.println("Before B: " + b);
        b=b+a;
        a=b-a;
        b=b-a;
        System.out.println("After A: " + a);
        System.out.println("After B: " + b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two value");
        swapping(sc.nextInt(), sc.nextInt());
    }
}