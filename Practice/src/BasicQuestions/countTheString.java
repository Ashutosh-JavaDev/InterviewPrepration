package BasicQuestions;

import java.util.Scanner;

public class countTheString {
    static int count = 0, space = 0, number = 0, special = 0;

    public static void Count(String str) {
        // if(str.length()==0){
        // return;
        // }
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                number++;
            }

            else if (Character.isWhitespace(c)) {
                space++;
            } else if (Character.isLetter(c)) {
                count++;
            } else {
                special++;
            }
        }

        System.out.println("Word: " + count);
        System.out.println("Digit: " + number);
        System.out.println("Space: " + space);
        System.out.println("Special value: " + special);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        Count(str);
    }

}
