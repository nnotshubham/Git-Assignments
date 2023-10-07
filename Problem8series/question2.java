
package Problem8series;

import java.util.*;

public class question2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int phone_price_input = a.nextInt();
        if (phone_price_input > 80000) {
            System.out.println("Item is too expensive");

        } else {
            System.out.println("Phone is affordable");
        }
    }
}
