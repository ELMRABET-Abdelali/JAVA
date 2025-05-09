import java.time.LocalDate;

class Main {
    public static void main(String[] args) {
        User youngerUser = new User();
        
        youngerUser.name = "amine said";
        youngerUser.birthDay = LocalDate.parse("1998-01-01");
        
        System.out.printf("%s est né le %s et il a maintenant %d ans.%n", 
                          youngerUser.name, 
                          youngerUser.birthDay.toString(), 
                          youngerUser.age());

        User olderUser = new User();
        
        olderUser.name = "siham kinan";
        olderUser.birthDay = LocalDate.parse("1979-01-01");
        
        System.out.printf("%s est née le %s et elle a maintenant %d ans.%n", 
                          olderUser.name, 
                          olderUser.birthDay.toString(), 
                          olderUser.age());
    }
}
