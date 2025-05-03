// 1. premier example de tableux 'arrays', montrere un element de tableau

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        char vowels[] = new char[5];
        
        // Initializing the array with vowel characters
        vowels[0] = 'a';
        vowels[1] = 'e';
        vowels[2] = 'i';
        vowels[3] = 'o';
        vowels[4] = 'u';

        // Printing the third element in the array (which is 'i')
        System.out.println(vowels[2]);
    }
}

// 2. montrere tous les elements de tableau avec Arrays.toString()

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        char vowels[] = new char[5];

        // Initializing the array with vowel characters
        vowels[0] = 'a';
        vowels[1] = 'e';
        vowels[2] = 'i';
        vowels[3] = 'o';
        vowels[4] = 'u';

        // Printing the entire array using Arrays.toString()
        System.out.println(Arrays.toString(vowels));
    }
}

// 3. un tablau ne peut pas dépasser le nombre saisi de valeurs a mettre.

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        char vowels[] = new char[5];

        // Initializing the array with vowel characters
        vowels[0] = 'a';
        vowels[1] = 'e';
        vowels[2] = 'i';
        vowels[3] = 'o';
        vowels[4] = 'u';
        vowels[5] = 'z';  

        // Print the array using Arrays.toString()
        System.out.println(Arrays.toString(vowels));
    }
}

// 4. une maniere plus simple de presenter les elements de tableau

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        // Direct initialization of the char array with vowels
        char vowels[] = {'a', 'e', 'i', 'o', 'u'};

        // Print the array using Arrays.toString()
        System.out.println(Arrays.toString(vowels));
    }
}

// 5. changement de valeur d'un element de tableau

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        // Direct initialization of the char array with vowels
        char vowels[] = {'a', 'e', 'i', 'o', 'u'};
        
        // Change the third element (index 2) from 'i' to 'x'
        vowels[2] = 'x';

        // Print the array using Arrays.toString()
        System.out.println(Arrays.toString(vowels));
    }
}

// 6. calculer la longeur d'un tableau 

class Main {
    public static void main(String[] args) {
        // Direct initialization of the char array with vowels in a different order
        char vowels[] = {'e', 'u', 'a', 'o', 'i'};

        // Print the length of the array
        System.out.println(vowels.length);
    }
}

// 7. classifier par ordre croissant d'alphabet

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        char vowels[] = {'e', 'u', 'a', 'o', 'i'};

        // Sort the array using Arrays.sort()
        Arrays.sort(vowels);

        // Print the sorted array using Arrays.toString()
        System.out.println(Arrays.toString(vowels));
    }
}

// 8. classification de quelques elements de tableau, ex: key.

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        char vowels[] = {'e', 'u', 'a', 'o', 'i'};

        int startingIndex = 1; // inclusive
        int endingIndex = 4;   // exclusive

        // Sort the subarray from index 1 to 3 (endingIndex is exclusive)
        Arrays.sort(vowels, startingIndex, endingIndex);

        // Print the entire array to show the modified subarray
        System.out.println(Arrays.toString(vowels));
    }
}

// 9. Dnnner l'index d'un element de tableau 

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        char vowels[] = {'e', 'u', 'a', 'o', 'i'};

        // Sort the array
        Arrays.sort(vowels);

        // Specify the key element to search for
        char key = 'o';

        // Perform binary search for the key element in the sorted array
        int foundItemIndex = Arrays.binarySearch(vowels, key);

        // Print the sorted array
        System.out.println(Arrays.toString(vowels));

        // Print the index of the found item
        System.out.println(foundItemIndex);
    }
}

// 10. On peut aussi cadrer la recherche de l'index d'un element 

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        char vowels[] = {'e', 'u', 'a', 'o', 'i'};

        // Sort the array
        Arrays.sort(vowels);

        // Specify the range of indices for binary search: from index 1 to 4 (exclusive)
        int startingIndex = 1;
        int endingIndex = 4;

        // Specify the key element to search for
        char key = 'o';

        // Perform binary search within the specified range
        int foundItemIndex = Arrays.binarySearch(vowels, startingIndex, endingIndex, key);

        // Print the entire sorted array
        System.out.println(Arrays.toString(vowels));

        // Print the result of the binary search
        System.out.println(foundItemIndex);
    }
}

// 11. On peut aussi avoir une valeur negative en cas d'absance d'element en recherche ! b -> -2

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        char vowels[] = {'e', 'u', 'a', 'o', 'i'};

        // Sort the array
        Arrays.sort(vowels);

        // Specify a key element to search for, which may not be present
        char key = 'b';

        // Perform binary search for the key element
        int foundItemIndex = Arrays.binarySearch(vowels, key);

        // Print the sorted array
        System.out.println(Arrays.toString(vowels));

        // Print the result of the binary search
        System.out.println(foundItemIndex);
    }
}

// 12. On utilise la fonction fill pour remplir des elements dans le tableau

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        char vowels[] = {'e', 'u', 'a', 'o', 'i'};

        // Fill the entire array with 'x'
        Arrays.fill(vowels, 'x');

        // Print the array after filling it with 'x'
        System.out.println(Arrays.toString(vowels));
    }
}

// 13. On peut aussi cadrer l'operation de remplissage d'elements dans le tableau

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        char vowels[] = {'e', 'u', 'a', 'o', 'i'};
        
        int startingIndex = 1;
        int endingIndex = 4;

        Arrays.fill(vowels, startingIndex, endingIndex, 'x');

        System.out.println(Arrays.toString(vowels));
    }
}

// 14. le tableau copie qui change le contenu de l'original au moment de son changement (pointage !!!)

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5};
        
        int copyOfNumbers[] = numbers; // on a crée un copie 

        Arrays.fill(numbers, 0); // rempli la copie avec des 0

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(copyOfNumbers));
    }
}

// 15. Voici commment créer une copie d'un tableau sans créer une relation entre eux avec Arrays.copyOf()

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5};
        
        int copyOfNumbers[] = Arrays.copyOf(numbers, numbers.length);

        Arrays.fill(numbers, 0);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(copyOfNumbers));
    }
}

// 16. copier des elements de tableau puis les ajouter dans un tableau plus grand

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5};

        int startingIndex = 2;
        int endingIndex = 10;  // Updated to fit the actual length of the numbers array

        int copyOfNumbers[] = Arrays.copyOfRange(numbers, startingIndex, endingIndex);

        Arrays.fill(numbers, 0);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(copyOfNumbers));
    }
}

// 17. faire la difference entre objet (memoire et identité differente) et valeurs qui sont égaux, en bref objet != objetCopie.

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5};
        
        int copyOfNumbers[] = Arrays.copyOf(numbers, numbers.length);

        System.out.println(numbers == copyOfNumbers);
    }
}

// 18. comparaison entre valeur de deux copies 

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5};
        
        int copyOfNumbers[] = Arrays.copyOf(numbers, numbers.length);

        System.out.println(Arrays.equals(numbers, copyOfNumbers));
    }
}
























































































































































































































