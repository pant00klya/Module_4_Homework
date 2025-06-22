package Module_4;

import java.util.Scanner;

public class Middle4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String ingredient = scanner.nextLine();
        switch (ingredient) {
            case ("кофе молоко яйца"): {
                System.out.println("Можно приготовить кофе, яичницу, омлет");
                break;
            }
            case ("кофе молоко"): {
                System.out.println("Можно приготовить кофе");
                break;
            }
            case ("молоко яйца"): {
                System.out.println("Можно приготовить омлет, яичницу");
                break;
            }
            case ("яйца"):
            case ("кофе яйца"): {
                System.out.println("Можно приготовить яичницу");
                break;
            }
            default: {
                System.out.println("Нельзя ничего приготовить");
            }
        }
    }
}
