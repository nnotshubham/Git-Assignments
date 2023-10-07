package Problem8series;

import java.util.*;

public class question6 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int temp = p.nextInt();
        if (temp > 40 && temp < 80) {
            System.out.println("Normal Temperature");
        } else {
            System.out.println("Abnormal Temperature");
        }
    }
}
