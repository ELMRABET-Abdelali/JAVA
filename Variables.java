// 1. Declarer et utiliser une variable age 
class Main {
    public static void main(String[] args) {
        int age ;
        age = 25;

        System.out.println("I am " + age + " years old.");
    }
}

// 2. idem mais dans la meme ligne 

class Main {
    public static void main(String[] args) {
        int age = 25; // Initialize age with a value

        System.out.println("I am " + age + " years old.");
    }
}

// 3. variable déclarée mais non initialisé

class Main {
    public static void main(String[] args) {
        int age;
        System.out.println("I am " + age + " years old.");
    }
}

// 4. changement de valeur de variable

class Main {
    public static void main(String[] args) {
        int age = 25; // Initialize age with a value
        age = 40;
        System.out.println("I am " + age + " years old.");
    }
}

// 5. double declaration dans la meme classe

class Main {
    public static void main(String[] args) {
        int age = 25; // Initialize age with a value
        int age = 60;
        
        System.out.println("I am " + age + " years old.");
    }
}

// 6. déclaration dans toute la classe sans static

class Main {
    int age = 25;
    public static void main(String[] args) {
        System.out.println("I am " + age + " years old.");
    }
}

// 7. déclaration dans toute la classse avec static

class Main {
    static int age = 25;
    public static void main(String[] args) {
        System.out.println("I am " + age + " years old.");
    }
}

// 8. déclaration avec static mais sans initialisation

class Main {
    static int age;
    public static void main(String[] args) {
        System.out.println("I am " + age + " years old.");
    }
}

// 9. déclaration de variable mais pas dans le meme bloc

class Main {
    static int age;
    public static void main(String[] args) {
        int age = 25;
        System.out.println("I am " + age + " years old.");
    }
}


// 10. déclaration de variables (ecriture)

class Main {
    public static void main(String[] args) {
        int age = 25; 
        int $age = 30; 
        int _age = 35;
        int myAge = 40; // best choice
        int a = 45; 

        System.out.println("age: " + age);
        System.out.println("$age: " + $age);
        System.out.println("_age: " + _age);
        System.out.println("myAge: " + myAge);
        System.out.println("a: " + a);
    }
}

// 11. déclaration de variable non pris en charge 1

class Main {
    public static void main(String[] args) {
        int 6age = 25; 

        System.out.println("age: " + 6age);

    }
}


// 12. déclaration de variable non pris en charge 1

class Main {
    public static void main(String[] args) {
        int mon age = 25; 

        System.out.println("age: " + mon age);

    }
}











