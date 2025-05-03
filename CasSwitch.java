// 1. meme example de InstructionsConditionnelles mais avec switch

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le premier nombre : ");
        double nombre1 = scanner.nextDouble();

        System.out.print("Entrez le deuxième nombre : ");
        double nombre2 = scanner.nextDouble();

        scanner.nextLine(); // Consommer le retour à la ligne restant

        System.out.print("Quelle opération souhaitez-vous effectuer (add, sub, mul, div) ? ");
        String operation = scanner.nextLine();

        switch (operation) {
            case "add":
                System.out.printf("%f + %f = %f\n", nombre1, nombre2, nombre1 + nombre2);
                break;
            case "sub":
                System.out.printf("%f - %f = %f\n", nombre1, nombre2, nombre1 - nombre2);
                break;
            case "mul":
                System.out.printf("%f * %f = %f\n", nombre1, nombre2, nombre1 * nombre2);
                break;
            case "div":
                if (nombre2 == 0) {
                    System.out.println("Impossible de diviser par zéro.");
                } else {
                    System.out.printf("%f / %f = %f\n", nombre1, nombre2, nombre1 / nombre2);
                }
                break;
            default:
                System.out.printf("%s n'est pas une opération supportée.\n", operation);
        }

        scanner.close();
    }
}
