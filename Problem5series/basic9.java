package Problem5series;

import java.util.*;

public class basic9 {
    public static void main(String[] args) {
        int count = 0;
        Scanner A = new Scanner(System.in);
        String Sa = A.nextLine();
        for (int i = 0; i < Sa.charAt(i); i++) {
            if (Sa.charAt(i) == ' ') {
                for (int j = 0; j <= i; j++) {
                    System.out.print(Sa.charAt(j));
                }
                break;
            }
        }
    }
}
