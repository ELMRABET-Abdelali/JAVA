import java.time.LocalDate;

class Main {
    public static void main(String[] args) {
        User user = new User("amine saad", "1995-01-31");

        // user.name = "amine saad";
        // user.birthDay = LocalDate.parse("1995-01-31");

        Book book = new Book("carmilla", "Sheridan Le Fanu");
                      
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

        System.out.printf("%s a emprunté ces livres : %s \n", user.name, user.books.toString());
                      
    }
}
