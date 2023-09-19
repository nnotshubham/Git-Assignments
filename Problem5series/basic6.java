package Problem5series;

import java.util.*;

public class basic6 {
    public static void main(String[] args) {
        int count = 0;
        Scanner Sa = new Scanner(System.in);
        String S = Sa.nextLine();
        for (int i = 0; i < S.length(); i++) {

            if (S.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("the no of words are:" + (count + 1));
    }
}
