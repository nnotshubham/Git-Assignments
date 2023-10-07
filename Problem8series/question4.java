package Problem8series;

import java.util.*;

public class question4 {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int phone_price_inputt = d.nextInt();
        boolean isPhoneExpensive = (phone_price_inputt >= 80000);
        if (isPhoneExpensive) {
            System.out.println("Phone is too expensive");
        } else {
            System.out.println("Phone is affordable");
        }

    }
}
