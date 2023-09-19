package Problem5series;

import java.util.*;

public class basic4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a String:");
        String n = sc.nextLine();
        for (int i = 0; i < n.length(); i++) {
            String z = String.valueOf(n.charAt(i));
            System.out.println(z);
        }
    }
}
