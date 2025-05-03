// 1. ajouter une entrée simple

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quel est votre nom ? "); // Ask for the user's name (in the same line) !!!
        String name = scanner.nextLine();

        System.out.println("Votre nom est " + name); // Print the user's name 

        scanner.close();
    }
}

// 2. + infos: print() affiche dans la meme ligne et '\n' permet de passer a la ligne suivante 

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quel est votre nom ? \n"); // Ask for the user's name
        String name = scanner.nextLine();

        System.out.println("Votre nom est " + name); // Print the user's name 

        scanner.close();
    }
}

// 3. le problem de nextline au niveau de la reception de valeur de la part de l'utilisateur

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quel est votre nom ? ");
        String name = scanner.nextLine();

        System.out.printf("Bonjour %s. Quel est votre âge ? ", name);
        int age = scanner.nextInt(); 
        scanner.nextLine(); // Utilise 'nextLine' pour consommer le retour de ligne après l'entier

        System.out.printf("%d ans est un bon âge pour commencer à programmer. Quelle technologie préférez-vous ? ", age);
        String technology = scanner.nextLine();

        System.out.printf("%s est une technologie très populaire.", technology);

        scanner.close();
    }
}

// 4. utilisation de parseint pour resoudre le meme probleme d'input 

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quel est votre nom ? ");
        String name = scanner.nextLine();

        System.out.printf("Bonjour %s. Quel est votre âge ? ", name);
        int age = Integer.parseInt(scanner.nextLine()); // Utilisation de `parseInt` pour lire l'âge et skip l'entrer 

        System.out.printf("%d ans est un bon âge pour commencer à programmer. Quelle technologie préférez-vous ? ", age);
        String technology = scanner.nextLine();

        System.out.printf("%s est une technologie très populaire.", technology);

        scanner.close();
    }
}

// 5. example complet d'input 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander le nom de l'utilisateur
        System.out.print("Quel est votre nom ? ");
        String nom = scanner.nextLine();

        // Demander l'âge de l'utilisateur
        System.out.print("Bonjour " + nom + ". Quel âge avez-vous ? ");
        int age = Integer.parseInt(scanner.nextLine());

        // Demander la moyenne (GPA) de l'utilisateur
        System.out.print("Quelle est votre moyenne (GPA) ? ");
        double gpa = Double.parseDouble(scanner.nextLine());

        // Demander le sexe de l'utilisateur en utilisant un char
        System.out.print("Quel est votre sexe (H/F) ? ");
        char sexe = scanner.nextLine().charAt(0);

        // Demander si l'utilisateur est étudiant en utilisant un booléen
        System.out.print("Êtes-vous étudiant (true/false) ? ");
        boolean estEtudiant = Boolean.parseBoolean(scanner.nextLine());

        // Afficher les informations collectées
        System.out.printf("Résumé du Profil :\nNom : %s\nÂge : %d\nMoyenne : %.2f\nSexe : %c\nÉtudiant : %b\n", 
                           nom, age, gpa, sexe, estEtudiant);

        // Exemple d'opérations sur les chaînes de caractères
        String nomMajuscules = nom.toUpperCase();
        System.out.println("Votre nom en majuscules : " + nomMajuscules);

        boolean nomEstVide = nom.isEmpty();
        System.out.println("Votre nom est-il vide ? " + nomEstVide);

        boolean nomEgalJohn = nom.equalsIgnoreCase("John");
        System.out.println("Votre nom est-il 'John' (insensible à la casse) ? " + nomEgalJohn);

        String nomRemplace = nom.replace('a', '@');
        System.out.println("Votre nom avec 'a' remplacé par '@' : " + nomRemplace);

        // Fermer le scanner
        scanner.close();
    }
}












