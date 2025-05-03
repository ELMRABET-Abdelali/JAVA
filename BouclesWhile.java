// 1. un example de while ou tantque, multiplication.

class Main {
    public static void main(String[] args) { 
        int number = 5;
        int multiplier = 1;

        while (multiplier <= 10) { // determiner nombre d'itération maximal
            System.out.printf("%d x %d = %d \n", number, multiplier, number * multiplier);
            multiplier++; // ajout dans chaque itération
        }
    }
}






























