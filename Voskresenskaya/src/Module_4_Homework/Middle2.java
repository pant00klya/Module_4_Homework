package Module_4_Homework;

import java.util.Scanner;

public class Middle2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите два разных числа: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        if (a % b == 0) {
            System.out.println("Первое число кратно второму"  );
        } else {
            double remainder = a % b;
            System.out.println("Первое число не кратно второму. Остаток от деления равен: " + remainder);
        }
    }
}
