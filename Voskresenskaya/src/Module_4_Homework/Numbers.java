package Module_4_Homework;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        if ((c > a) && (a > b)) {
            System.out.println("Max = " + c + " Mid = " + a + " Min = " + b);
        } else if ((c > b) && (b > a)) {
            System.out.println("Max = " + c + " Mid = " + b + " Min = " + a);
        } else if ((b > a) && (a > c)) {
            System.out.println("Max = " + b + " Mid = " + a + " Min = " + c);
        } else if ((b > c) && (c > a)) {
            System.out.println("Max = " + b + " Mid = " + c + " Min = " + a);
        } else if ((a > b) && (b > c)) {
            System.out.println("Max = " + a + " Mid = " + b + " Min = " + c);
        } else if ((a > c) && (c > b)) {
            System.out.println("Max = " + a + " Mid = " + c + " Min = " + b);
        }
    }
}
