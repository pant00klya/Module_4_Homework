package Module_4_Homework;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a > (b+c)) {
            System.out.println("triangle doesn't exist");
        } else if (a < (b+c)) {
            System.out.println("triangle exists!");
        }
    }
}
