package BasicQuestions;

public class VowelCheck {
   static boolean res = false;
   static int count=0;
    public static boolean vowelcheck(String str) {
        if (str.length() - 1 == 0) {
            return false;
        } else {
            if (str.charAt(str.length() - 1) == 'A' || str.charAt(str.length() - 1) == 'E'
                    || str.charAt(str.length() - 1) == 'I' || str.charAt(str.length() - 1) == 'O'
                    || str.charAt(str.length() - 1) == 'U') {
              res=true;
            }

        }
        vowelcheck(str.substring(0, str.length()-1));
        return res;
    }

    public static void main(String[] args) {
        boolean res=vowelcheck("Ravi");
        System.out.println(res);
    }
}
