// 1. example de Hashmap 

import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> notesExamens = new HashMap<String, Integer>();

        notesExamens.put("Mathématiques", 75);
        notesExamens.put("Sociologie", 85);
        notesExamens.put("Anglais", 95);
        notesExamens.put("Bengali", 100);
        notesExamens.put("Programmation Informatique", 100);

        System.out.println(notesExamens.toString());
    }
}

// 2. Avoir la valeur de hashmap 

import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> notesExamens = new HashMap<String, Integer>();

        notesExamens.put("Mathématiques", 75);
        notesExamens.put("Sociologie", 85);
        notesExamens.put("Anglais", 95);
        notesExamens.put("Programmation Informatique", 100);

        System.out.println(notesExamens.get("Anglais"));
    }
}

// 3. Remplacer une valeur par defaut en hashmap si c'est vide

import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> notesExamens = new HashMap<String, Integer>();

        notesExamens.put("Mathématiques", null);
        notesExamens.put("Sociologie", 85);
        notesExamens.put("Anglais", 95);
        notesExamens.put("Programmation Informatique", 100);

        notesExamens.putIfAbsent("Mathématiques", 70);

        System.out.println(notesExamens.toString());
    }
}

// 4. remplacer a valeur d'un hashmap

import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> notesExamens = new HashMap<String, Integer>();

        notesExamens.put("Mathématiques", 75);
        notesExamens.put("Sociologie", 85);
        notesExamens.put("Anglais", 95);
        notesExamens.put("Programmation Informatique", 100);

        notesExamens.replace("Mathématiques", 70);

        System.out.println(notesExamens.toString());
    }
}

// 5. Avoir la valeur de l'element choisi hashmap sinon la valeur déclaré, getOrDefault("Francais", -1).

import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> notesExamens = new HashMap<String, Integer>();

        notesExamens.put("Mathématiques", 75);
        notesExamens.put("Sociologie", 85);
        notesExamens.put("Anglais", 95);
        notesExamens.put("Programmation Informatique", 100);

        System.out.println(notesExamens.getOrDefault("Francais", -1));
    }
}

// 6. afficher hashmap après suppression, clear().

import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> notesExamens = new HashMap<String, Integer>();

        notesExamens.put("Mathématiques", 75);
        notesExamens.put("Sociologie", 85);
        notesExamens.put("Anglais", 95);
        notesExamens.put("Programmation Informatique", 100);

        notesExamens.clear();

        System.out.println(notesExamens.toString());
    }
}

// 7. Voir la taille de hashmap 

import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> notesExamens = new HashMap<String, Integer>();

        notesExamens.put("Mathématiques", 75);
        notesExamens.put("Sociologie", 85);
        notesExamens.put("Anglais", 95);
        notesExamens.put("Programmation Informatique", 100);

        System.out.println(notesExamens.size());
    }
}

// 8. Enever un element de hashmap

import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> notesExamens = new HashMap<String, Integer>();

        notesExamens.put("Mathématiques", 75);
        notesExamens.put("Sociologie", 85);
        notesExamens.put("Anglais", 95);
        notesExamens.put("Programmation Informatique", 100);

        notesExamens.remove("Sociologie");

        System.out.println(notesExamens.toString());
    }
}

// 9. Voir si une clée est disponible sur le hashmap(clée, valeur)

import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> notesExamens = new HashMap<String, Integer>();

        notesExamens.put("Mathématiques", 75);
        notesExamens.put("Sociologie", 85);
        notesExamens.put("Anglais", 95);
        notesExamens.put("Programmation Informatique", 100);

        notesExamens.remove("Sociologie");

        System.out.println(notesExamens.containsKey("Mathématiques"));
    }
}

// 10. Voir l'existance d'une valeur dans le hashmap

import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> notesExamens = new HashMap<String, Integer>();

        notesExamens.put("Mathématiques", 75);
        notesExamens.put("Sociologie", 85);
        notesExamens.put("Anglais", 95);
        notesExamens.put("Programmation Informatique", 100);

        notesExamens.remove("Sociologie");

        System.out.println(notesExamens.containsValue(100));
    }
}

// 11. idem comme 10, containsValue(Integer.valueOf(100))

import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> notesExamens = new HashMap<String, Integer>();

        notesExamens.put("Mathématiques", 75);
        notesExamens.put("Sociologie", 85);
        notesExamens.put("Anglais", 95);
        notesExamens.put("Programmation Informatique", 100);
      
        notesExamens.remove("Sociologie");

        System.out.println(notesExamens.containsValue(Integer.valueOf(100)));
    }
}

// 12. voir si le hashmap est vide avec une meniere simple

import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> notesExamens = new HashMap<String, Integer>();

        notesExamens.put("Mathématiques", 75);
        notesExamens.put("Sociologie", 85);
        notesExamens.put("Anglais", 95);
        notesExamens.put("Programmation Informatique", 100);

        notesExamens.remove("Sociologie");

        System.out.println(notesExamens.isEmpty());
    }
}

// 13. utilisation de boucle dans hashmap pour affichage customisé

import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> notesExamens = new HashMap<String, Integer>();

        notesExamens.put("Mathématiques", 75);
        notesExamens.put("Sociologie", 85);
        notesExamens.put("Anglais", 95);
        notesExamens.put("Programmation Informatique", 100);

        notesExamens.forEach((sujet, note) -> {
            System.out.println(sujet + " - " + note);
        });
    }
}

// 14. changement de valeur de hashmap par boucle 

import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> notesExamens = new HashMap<String, Integer>();

        notesExamens.put("Mathématiques", 75);
        notesExamens.put("Sociologie", 85);
        notesExamens.put("Anglais", 95);
        notesExamens.put("Programmation Informatique", 100);

        notesExamens.forEach((sujet, note) -> {
            notesExamens.replace(sujet, note + 10);
        });

        System.out.println(notesExamens.toString());
    }
}


























































































