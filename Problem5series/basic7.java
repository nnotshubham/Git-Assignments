package Problem5series;

import java.util.*;

public class basic7 {
    public static void main(String[] args) {
        int counter = 0;
        Scanner S = new Scanner(System.in);
        String Sc = S.nextLine();
        for (int i = 0; i < Sc.length(); i++) {
            if (Sc.charAt(i) == '.') {
                counter++;
            }
        }
        System.out.println("The no of sentences are" + counter);
    }
}
