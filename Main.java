import java.time.LocalDate;

class Main {
    public static void main(String[] args) {
        User youngerUser = new User();

        youngerUser.name = "Farhan Hasin Junior";
        youngerUser.birthDay = LocalDate.parse("1995-01-31");

        System.out.printf("%s was born back in %s and he is now %d years old.", 
                          youngerUser.name, 
                          youngerUser.birthDay.toString(), 
                          youngerUser.age());
    }
}
