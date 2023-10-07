
package Problem8series;

import java.util.*;

public class question1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int heartrate = sc.nextInt();
        System.out.println("the mentioned heart rate is:" + heartrate);
        if (heartrate < 30 || heartrate > 120) {
            System.out.println("Abnormal Heart Rate!!");
        }
    }
}
