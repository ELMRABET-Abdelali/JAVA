import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {
    public String name;
    // public String birthDay;
    private LocalDate birthDay;
    public ArrayList<Book> books = new ArrayList<Book>();

    User(String name, String birthDay) {
        this.name = name;
        this.birthDay = LocalDate.parse(birthDay);
    }

    public String getBirthDay() {
        return this.birthDay.toString();
    }
    
    public void borrow(Book book) {
        this.books.add(book);
    }

    public int age() {
        int age = Period.between(this.birthDay, LocalDate.now()).getYears();
        return age;
    }
}


