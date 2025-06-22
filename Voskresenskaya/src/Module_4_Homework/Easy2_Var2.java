package Module_4_Homework;

import java.util.Scanner;

public class Easy2_Var2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int x = scanner.nextInt();
        switch (x) {
            case (1): {
                System.out.println("Зима");
                break;
            }
            case (2): {
                System.out.println("Весна");
                break;
            }
            case (3): {
                System.out.println("Лето");
                break;
            }
            case (4): {
                System.out.println("Осень");
                break;
            }
        }
    }
}
