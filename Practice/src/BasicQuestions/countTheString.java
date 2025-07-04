package BasicQuestions;

import java.util.Scanner;

public class countTheString {
    static int count = 0, space = 0, number = 0, special = 0;

    public static void Count(String str) {
        // if(str.length()==0){
        //     return;
        // }
        for(char c:str.toCharArray()){
            if(Character.isDigit(c)){
                number++;
            }

            if(Character.isWhitespace(c)){
                space++;
            }
            if(Character.isLetter(c)){
                count++;
            }
            else{
                special++;
            }
        }
    }

}
