// 1. example de chaine de caractere.

class Main {
    public static void main(String[] args) {
        char percentSign = '%';

        // Prints the percent sign character
        System.out.println("Percent Sign: " + percentSign);
    }
}

// 2. définition d'une variable de type string 'ensemble de chaines de caracteres'

class Main {
    public static void main(String[] args) {
        String name = "John Doe";

        // Prints the name
        System.out.println("Name: " + name);
    }
}

// 3. une autre maniere de definir string (jvm create new object here each time).

class Main {
    public static void main(String[] args) {
        // String name = "John Doe";
        String name = new String("John Doe");

        System.out.println(name);
    }
}

// 4. comparaison des deux string

class Main {
    public static void main(String[] args) {
        String literalString1 = "abc";
        String literalString2 = "abc";

        String objectString1 = new String("xyz");
        String objectString2 = new String("xyz");

        System.out.println(literalString1 == literalString2);
        System.out.println(objectString1 == objectString2);
    }
}

// 5. print avec variable

class Main {
    public static void main(String[] args) {
        String name = "Yassine Harit";
        String country = "Maroc";
        int age = 24;
        String company = "Innovatech";

        System.out.println("Bonjour! Je m'appelle " + name + ". Je viens du " + country + " et j'ai " + age + " ans. Je travaille chez " + company + ".");
    }
}

// 6. print avec symbole de variable %s

class Main {
    public static void main(String[] args) {
        String name = "Yassine Harit"; // %s
        String country = "Maroc"; // %s
        int age = 24; // %d
        char gender = 'M'; // %c
        boolean isEmployed = true; // %b
        String company = "Innovatech"; // %s
        double experience = 3.5; // %f
        String city = "Casablanca"; // %s
        String role = "Développeur logiciel"; // %s

        String formattedString = String.format(
            "Bonjour! Je m'appelle %s. Je viens du %s, résidant à %s, et j'ai %d ans. Je suis de genre %c et actuellement employé: %b. Je travaille comme %s chez %s. J'ai %.1f ans d'expérience.", // formatted string
            name, country, city, age, gender, isEmployed, role, company, experience
        );

        System.out.println(formattedString); // output the formatted string
    }
}

// 7. longeur de la phrase string

class Main {
    public static void main(String[] args) {
        String name = "Yassine Harit";

        System.out.println(name.length());
    }
}

// 8. string variable vide ou pas ?

class Main {
    public static void main(String[] args) {
        String name = "Yassine Harit";

        System.out.println(name.isEmpty());
    }
}

// 9. Transformer une chaine de caracteres string en maj ou min

class Main {
    public static void main(String[] args) {
        String name = "Yassine Harit";

        System.out.println(name.toUpperCase()); //maj
        System.out.println(name.toLowerCase()); //min
        System.out.println(name); // same result no change !
    }
}

// 10. comparaison d'objets avec meme valeur string

class Main {
    public static void main(String[] args) {
        String string1 = new String("abc");
        String string2 = new String("abc");

        System.out.println(string1 == string2);
    }
}

// 11. comparaision des valeurs des deux objets

class Main {
    public static void main(String[] args) {
        String string1 = new String("abc");
        String string2 = new String("abc");

        System.out.println(string1.equals(string2));
    }
}

// 12. comparaison des valeurs des deux objets tout en ignorant maj et min

class Main {
    public static void main(String[] args) {
        String string1 = new String("abc");
        String string2 = new String("ABC");

        System.out.println(string1.equalsIgnoreCase(string2));
    }
}

// 13. remplacer un element dans string 

class Main {
    public static void main(String[] args) {
        String string = "Java is fun.";

        System.out.println(string.replace("fun", "powerful"));
        System.out.println(string);
    }
}

// 14. remplacement dans une autre variable

class Main {
    public static void main(String[] args) {
        String string = "Java is fun.";

        String updatedString = string.replace("fun", "powerful");

        System.out.println(updatedString);
    }
}

// 15. un element existant dans un string

class Main {
    public static void main(String[] args) {
        String string = "The ocean is vast.";

        System.out.println(string.contains("ocean"));
    }
}
































































































