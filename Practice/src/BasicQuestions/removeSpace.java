package BasicQuestions;

public class removeSpace {
    static String st = "";

    public static String remove(String str) {
        if (str.length() - 1 == -1) {
            return str;
        } else {
            if (str.charAt(str.length() - 1) == ' ') {
                remove(str.substring(0, str.length() - 1));
            } else {
                remove(str.substring(0, str.length() - 1));
                st += str.charAt(str.length() - 1);

            }
        }
        return st;
    }

    public static void main(String[] args) {
        String str = "Jay Shree Ram";
        String st = remove(str);
        System.out.println(st);
    }
}
