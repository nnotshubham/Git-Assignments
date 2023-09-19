package Problem5series;

import java.util.*;

public class basic8 {
    public static void main(String[] args) {
        int counter = 0;
        Scanner Sf = new Scanner(System.in);
        String Name = Sf.nextLine();
        for (int i = 0; i < Name.length(); i++) {
            if (Name.charAt(i) == 'a' || Name.charAt(i) == 'A') {
                counter++;
            } else if (Name.charAt(i) == 'e' || Name.charAt(i) == 'E') {
                counter++;
            } else if (Name.charAt(i) == 'i' || Name.charAt(i) == 'I') {
                counter++;
            } else if (Name.charAt(i) == 'o' || Name.charAt(i) == 'O') {
                counter++;
            } else if (Name.charAt(i) == 'u' || Name.charAt(i) == 'U') {
                counter++;
            }

        }
        System.out.println("the no of vowels are:" + counter);
    }

}
