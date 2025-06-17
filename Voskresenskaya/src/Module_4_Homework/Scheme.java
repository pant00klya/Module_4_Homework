package Module_4_Homework;

import java.util.Scanner;

public class Scheme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int x = scanner.nextInt();
        int y = 0;
        if (x > 0) {
            y = 2 * x;
        } else if (x < 0) {
            y = -2 * x;
        }
        System.out.println("Y равен = " + y);
    }
}
