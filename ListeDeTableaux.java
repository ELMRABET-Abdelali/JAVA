// 1. Example d'une liste d'un tableau, ajout et affichage.

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println(numbers.toString());
    }
}

// 2. Affichage par index

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1); // Index 0
        numbers.add(2); // Index 1
        numbers.add(3); // Index 2
        numbers.add(4); // Index 3
        numbers.add(5); // Index 4

        System.out.println(numbers.get(2));
    }
}

// 3. enlever un element de la liste de tableau par index avec remove()

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1); // Index 0
        numbers.add(2); // Index 1
        numbers.add(3); // Index 2
        numbers.add(4); // Index 3
        numbers.add(5); // Index 4

        numbers.remove(2); // Removes the element at index 2, which is 3

        System.out.println(numbers.toString());
    }
}

// 4. enlever un element de la liste de tableau par valeur

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1); // Index 0
        numbers.add(2); // Index 1
        numbers.add(3); // Index 2
        numbers.add(4); // Index 3
        numbers.add(5); // Index 4

        numbers.remove(Integer.valueOf(4)); // Removes the element 4 from the list

        System.out.println(numbers.toString());
    }
}

// 5. enlever tous les elements d'une liste de tableau 

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1); // Index 0
        numbers.add(2); // Index 1
        numbers.add(3); // Index 2
        numbers.add(4); // Index 3
        numbers.add(5); // Index 4

        numbers.clear(); // Removes all elements from the list

        System.out.println(numbers.toString());
    }
}

// 6. Remplacement d'une valeur en utilisant son index dans une liste de tableau

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1); // 0
        numbers.add(2); // 1
        numbers.add(3); // 2
        numbers.add(4); // 3
        numbers.add(5); // 4

        numbers.set(2, Integer.valueOf(30));

        System.out.println(numbers.toString());
    }
}

// 7. classifier les elements de liste de tableau en ordre croissant par sort(Comparator.naturalOrder())

import java.util.ArrayList;
import java.util.Comparator; // importer comparator !!!

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(5);
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);

        numbers.sort(Comparator.naturalOrder());

        System.out.println(numbers.toString()); // type de sort comparator !!!
    }
}

// 8. classifier les elements de liste de tableau en ordre décroissant par sort(Comparator.reverseOrder())

import java.util.ArrayList;
import java.util.Comparator; // importer comparator !!!

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(5);
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);

        numbers.sort(Comparator.reverseOrder());

        System.out.println(numbers.toString()); // type de sort comparator !!!
    }
}

// 9.  Compter le nombre d'elements dans la liste de tableau avec size

import java.util.ArrayList;
import java.util.Comparator;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(5);
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);

        System.out.println(numbers.size());
    }
}

// 10. Verifier si un element est disponible dans la liste de tableau

import java.util.ArrayList;
import java.util.Comparator;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(5);
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);

        System.out.println(numbers.contains(Integer.valueOf(1))); // est ce que la liste contient le nombre 1
    }
}

// 11. Voir si une liste de tableau est vide 

import java.util.ArrayList;
import java.util.Comparator;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(5);
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);

        numbers.clear();

        System.out.println(numbers.isEmpty());
    }
}

// 12. utilisastion d'une boucle pour faire une multiplication par 2 de la liste de tableau

import java.util.ArrayList;
import java.util.Comparator;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(5);
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);

        numbers.forEach(number -> {
            System.out.println(number * 2);
        });

        System.out.println(numbers.toString());
    }
}


// 13. Changement de valeurs de la liste de tableau avec une boucle

import java.util.ArrayList;
import java.util.Comparator;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(5);
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);

        System.out.println("before: " + numbers.toString());

        numbers.forEach(number -> {
            numbers.set(numbers.indexOf(number), number * 2);
            System.out.println(number * 2);
        });

        System.out.println("after: " + numbers.toString());
    }
}


  











































































































































