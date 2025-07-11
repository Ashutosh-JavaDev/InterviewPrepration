package BasicQuestions;

import java.util.ArrayList;

public class CheckOdd {
    static boolean res = false;
    public static boolean check(ArrayList<Integer> list, int index) {
        if (index == 0) {
            return res;
        } else {
            if (list.get(index) % 2 != 0) {
                res = true;
                check(list, index - 1);
            } else {
                check(list, index - 1);
                res=false;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(13);
        list.add(17);
        list.add(23);
        System.out.println(list.size());
        boolean res = check(list, list.size() - 1);
        System.out.print(res);
        System.out.println();

    }
}
