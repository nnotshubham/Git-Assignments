package Problem8series;

import java.util.*;

public class question5 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int salary_input = t.nextInt();
        int new_salary = salary_input + 1000;
        if (new_salary >= 5000) {
            System.out.println("Congratulations you have recieved a significant salary increase");
        } else {
            System.out.println("Your salary has been adjusted.Keep up the good work!!");
        }
    }
}
