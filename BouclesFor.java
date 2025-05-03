// 1. example d'une boucle 1 jusqu'a 10

class Main {
    public static void main(String[] args) {
        for (int number = 1; number <= 10; number++) {
            System.out.println(number);
        }
    }
}

// 2. boucle avec index 

class Main {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
        }
    }
}

// 3. calculer la sommme d'un tableau dans une boucle 

class Main {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int index = 0; index < numbers.length; index++) {
            sum += numbers[index];
        }

        System.out.println(sum);
    }
}

// 4. table de multiplication part itération et print 

class Main {
    public static void main(String[] args) {
        int number = 5;

        for (int multiplier = 1; multiplier < 10; multiplier++) {
            System.out.printf("%d x %d = %d \n", number, multiplier, number * multiplier);
        }
    }
}

// 5. Double Boucle , table de multiplication de 1 à 9

class Main {
  public static void main(String[] args) {
    for (int number = 1; number < 10; number++) {
      System.out.printf("Table de multiplication de %d : \n", number);
      for (int multiplier = 1; multiplier < 10; multiplier++) {
        System.out.printf("%d x %d = %d \n", number, multiplier, number * multiplier);
      }
      System.out.println(); // Ajoute une ligne vide entre les tables de multiplication
    }
  }
}

// 6. if dans for, donner la liste des nombre paire de 1 jusqu'a 50

class Main {
    public static void main(String[] args) {
        for (int number = 1; number <= 50; number++) {
            if (number % 2 == 1) {
                System.out.println(number);
            }
        }
    }
}

// 7. Boucler en utilisant le tableau lui meme, for (int number : numbers) 

class Main {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println(sum);
    }
}






































































