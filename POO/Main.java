import java.time.LocalDate;

class Main {
    public static void main(String[] args) {
        User user = new User("amine saad", "1995-01-31");

        // user.name = "amine saad";
        // user.birthDay = LocalDate.parse("1995-01-31");

        Book book = new Book("carmilla", "Sheridan Le Fanu", 270);

        // book.title = "Carmilla";
        // book.author = "Sheridan Le Fanu";

        user.borrow(book);

        System.out.printf("%s est né le %s et il a maintenant %d ans.%n", 
                          user.name, 
                          // user.birthDay.toString(), 
                          user.getBirthDay(), 
                          user.age());

        System.out.printf("%s a emprunté ces livres : %s%n", 
                          user.name, 
                          user.books.toString());


        Book carmilla = new Book("Carmilla", "Sheridan Le Fanu", 270);
        AudioBook dracula = new AudioBook("Dracula", "Bram Stoker", 400, 30000);
        Ebook jeeves = new Ebook("Carry On Jeeves", "P.G. Wodehouse", 280, "PDF");
        System.out.println(jeeves.toString());
        System.out.println(carmilla.toString());
        System.out.println(dracula.toString());

    }
}



