// 1. introduction, user class creation !
class Main {
    public static void main(String[] args) {
      System.out.println("Hello world!");
      User u = new User();
      u.name = "John";
      u.memberShip = "Premium";

      User u1 = new User();
      u1.name = "Jane";
      u1.memberShip = "Basic";

      System.out.println("l'utilisateur u est :");
      System.out.println(u.name);
      System.out.println(u.memberShip);
      System.out.println("l'utilisateur u1 est :");
      System.out.println(u1.name);
      System.out.println(u1.memberShip);
    }
}
--------------------
public class User {
  String name;
  String memberShip;
}

// 2. get & set avec private


class Main {
    public static void main(String[] args) {
      System.out.println("Hello world!");
      User u = new User();
      u.set_name("John");
      u.memberShip = "Premium";

      User u1 = new User();
      u1.set_name("Jane");
      u1.memberShip = "Basic";

      System.out.println("l'utilisateur u est :");
      System.out.println(u.get_name());
      System.out.println(u.memberShip);
      System.out.println("l'utilisateur u1 est :");
      System.out.println(u1.get_name());
      System.out.println(u1.memberShip);
    }
}
-------- 1
  public class User {
  private String name;
  String memberShip;

  void set_name(String name){
    this.name = name;
  }

  String get_name() {
    return this.name;
  }
}


--------- 2
public class User {
  // private only visible in the class, not usable outside!
  private String _name;
  String memberShip;

  void set_name(String name){
    _name = name;
  }

  String get_name() {
    return _name;
  }
}

-------------

// 3. method overloading pour enum

class Main {
    public static void main(String[] args) {
      System.out.println("Hello world!");
      User u = new User();
      u.set_name("John");
      u.setMemberShip(User.Membership.gold);

      User u1 = new User();
      u1.set_name("Jane");
      u1.memberShip = "Basic";

      System.out.println("l'utilisateur u est :");
      System.out.println(u.get_name());
      System.out.println(u.memberShip);
      System.out.println("l'utilisateur u1 est :");
      System.out.println(u1.get_name());
      System.out.println(u1.memberShip);
    }
}

--------------- 
public class User {
  private String name;
  String memberShip;

  void set_name(String name){
    this.name = name;
  }

  String get_name() {
    return this.name;
  }

  void setMemberShip(String memberShip) {
    this.memberShip = memberShip;
  }

  public String getMemberShip() {
    return memberShip;
  }

  void setMemberShip(Membership membership){
    this.memberShip = membership.name();
  }

  public enum Membership {
    bronze,silver,gold;
  }
  
}

// 4. Constructors

class Main {
    public static void main(String[] args) {
      System.out.println("Hello world!");
      User u = new User("John", "gold");
      // u.set_name("John");
      // u.setMemberShip(User.Membership.gold);

      User u1 = new User("Jane", "silver");
      // u1.set_name("Jane");
      // u1.memberShip = "Basic";

      System.out.println("l'utilisateur u est :");
      System.out.println(u.get_name());
      System.out.println(u.memberShip);
      System.out.println("l'utilisateur u1 est :");
      System.out.println(u1.get_name());
      System.out.println(u1.memberShip);
    }
}

-------------------

public class User {
  private String name;
  String memberShip;

  void set_name(String name){
    this.name = name;
  }

  String get_name() {
    return this.name;
  }

  void setMemberShip(String memberShip) {
    this.memberShip = memberShip;
  }

  public String getMemberShip() {
    return memberShip;
  }

  void setMemberShip(Membership membership){
    this.memberShip = membership.name();
  }

  public enum Membership {
    bronze,silver,gold;
  }

  public User(String name, String memberShip){
    set_name(name);
    setMemberShip(memberShip);
  }
  
}

// 5. Constructors (default)
  

class Main {
    public static void main(String[] args) {
      System.out.println("Hello world!");
      User u = new User("John", "gold");
      // u.set_name("John");
      // u.setMemberShip(User.Membership.gold);

      User u1 = new User("Jane", "silver");
      // u1.set_name("Jane");
      // u1.memberShip = "Basic";

      User u2 = new User();

      System.out.println("l'utilisateur u est :");
      System.out.println(u.get_name());
      System.out.println(u.memberShip);
      System.out.println("l'utilisateur u1 est :");
      System.out.println(u1.get_name());
      System.out.println(u1.memberShip);
                      
      System.out.println("l'utilisateur u2 est :");
      System.out.println(u2.get_name());
      System.out.println(u2.memberShip);
    }
}

-------------------

public class User {
  private String name;
  String memberShip;

  void set_name(String name){
    this.name = name;
  }

  String get_name() {
    return this.name;
  }

  void setMemberShip(String memberShip) {
    this.memberShip = memberShip;
  }

  public String getMemberShip() {
    return memberShip;
  }

  void setMemberShip(Membership membership){
    this.memberShip = membership.name();
  }

  public enum Membership {
    bronze,silver,gold;
  }

  public User(){
    set_name("default");
  }

  public User(String name, String memberShip){
    set_name(name);
    setMemberShip(memberShip);
  }
  
}

// 6.Method Override (to string example)

class Main {
    public static void main(String[] args) {
      System.out.println("Hello world!");
      User u = new User("John", "gold");
      // u.set_name("John");
      // u.setMemberShip(User.Membership.gold);

      User u1 = new User("Jane", "silver");
      // u1.set_name("Jane");
      // u1.memberShip = "Basic";

      User u2 = new User();

      System.out.println("l'utilisateur u est :");
      System.out.println(u);
      System.out.println(u.toString());

    }
}

---------------
public class User {
  private String name;
  String memberShip;

  void set_name(String name){
    this.name = name;
  }

  String get_name() {
    return this.name;
  }

  void setMemberShip(String memberShip) {
    this.memberShip = memberShip;
  }

  public String getMemberShip() {
    return memberShip;
  }

  void setMemberShip(Membership membership){
    this.memberShip = membership.name();
  }

  public enum Membership {
    bronze,silver,gold;
  }

  public User(){
    set_name("default");
  }

  public User(String name, String memberShip){
    set_name(name);
    setMemberShip(memberShip);
  }

  public String toString(){
    return String.format("%s is a %s member", this.name, this.memberShip);
  }
  
}

// 7. method ovveride (equals)

class Main {
    public static void main(String[] args) {
      System.out.println("Hello world!");
                      
      User u = new User("John", "gold");
      User u1 = new User("John", "gold");
                      
      System.out.println(u == u1);
      System.out.println(u.equals(u1));

    }
}

---------------------

public class User {
  private String name;
  String memberShip;

  void set_name(String name){
    this.name = name;
  }

  String get_name() {
    return this.name;
  }

  void setMemberShip(String memberShip) {
    this.memberShip = memberShip;
  }

  public String getMemberShip() {
    return memberShip;
  }

  void setMemberShip(Membership membership){
    this.memberShip = membership.name();
  }

  public enum Membership {
    bronze,silver,gold;
  }

  public User(){
    set_name("default");
  }

  public User(String name, String memberShip){
    set_name(name);
    setMemberShip(memberShip);
  }

  public String toString(){
    return String.format("%s is a %s member", this.name, this.memberShip);
  }

  public boolean equals(User u2){
    return this.name == u2.name && this.memberShip == u2.memberShip;
  }
  
}

// 8. generic list

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
      System.out.println("Hello world!");
                      
      User u = new User("John", "gold");

      ArrayList<User> users = new ArrayList<User>();
      users.add(u);
      users.add(new User("Jane", "silver"));
      users.add(new User("Jack", "bronze"));
      users.add(new User("Jill", "gold"));
      users.add(new User("Jake", "silver"));
                      
      System.out.println(users.get(0).get_name());
      System.out.println(users.get(1).get_name());

      System.out.println("printing users :");
      for (User user : users){
                        System.out.println(user.get_name());
      }
                      
      System.out.println("printing users name and membership :");
      for (int i = 0; i < users.size(); i++){
                        System.out.print(users.get(i).get_name());
                        System.out.println(" : " + users.get(i).getMemberShip());
      }

    }
}

-----------------

  public class User {
  private String name;
  String memberShip;

  void set_name(String name){
    this.name = name;
  }

  String get_name() {
    return this.name;
  }

  void setMemberShip(String memberShip) {
    this.memberShip = memberShip;
  }

  public String getMemberShip() {
    return memberShip;
  }

  void setMemberShip(Membership membership){
    this.memberShip = membership.name();
  }

  public enum Membership {
    bronze,silver,gold;
  }

  public User(){
    set_name("default");
  }

  public User(String name, String memberShip){
    set_name(name);
    setMemberShip(memberShip);
  }

  public String toString(){
    return String.format("%s is a %s member", this.name, this.memberShip);
  }

  public boolean equals(User u2){
    return this.name == u2.name && this.memberShip == u2.memberShip;
  }
  
}


// 9. Data Members

import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
      System.out.println("Hello world!");

      //ArrayList<User> users = new ArrayList<User>();
      User.admins = new ArrayList<User>();
                      
      //users.add(new User("Jane", "silver"));   // user => user.admins
      User.admins.add(new User("Jack", "bronze"));
      User.admins.add(new User("Jill", "gold"));
      User.admins.add(new User("Jake", "silver"));
                      
      System.out.println(User.admins.get(0).get_name());
      System.out.println(User.admins.get(1).get_name());

      System.out.println("printing users :");
      for (User user : User.admins){
                        System.out.println(user.get_name());
      }
 

    }
}

--------------------
  
import java.util.List;

public class User {
  private String name;
  String memberShip;

  // list users admins
  public static List<User> admins;

  void set_name(String name){
    this.name = name;
  }

  String get_name() {
    return this.name;
  }

  void setMemberShip(String memberShip) {
    this.memberShip = memberShip;
  }

  public String getMemberShip() {
    return memberShip;
  }

  void setMemberShip(Membership membership){
    this.memberShip = membership.name();
  }

  public enum Membership {
    bronze,silver,gold;
  }

  public User(){
    set_name("default");
  }

  public User(String name, String memberShip){
    set_name(name);
    setMemberShip(memberShip);
  }

  public String toString(){
    return String.format("%s is a %s member", this.name, this.memberShip);
  }

  public boolean equals(User u2){
    return this.name == u2.name && this.memberShip == u2.memberShip;
  }
  
}



// 10. Static method

import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
      System.out.println("Hello world!");

      User.admins = new ArrayList<User>();
                      
      User.admins.add(new User("Jack", "bronze"));
      User.admins.add(new User("Jill", "gold"));
      User.admins.add(new User("Jake", "silver"));

      // print users
      User.printUsers();
 

    }
}

--------------------

  import java.util.List;

public class User {
  private String name;
  String memberShip;

  public static List<User> admins;

  // print users method static
  public static void printUsers(){
    for (User user : admins){
      System.out.println(user.get_name());
    }
  }

  void set_name(String name){
    this.name = name;
  }

  String get_name() {
    return this.name;
  }

  void setMemberShip(String memberShip) {
    this.memberShip = memberShip;
  }

  public String getMemberShip() {
    return memberShip;
  }

  void setMemberShip(Membership membership){
    this.memberShip = membership.name();
  }

  public enum Membership {
    bronze,silver,gold;
  }

  public User(){
    set_name("default");
  }

  public User(String name, String memberShip){
    set_name(name);
    setMemberShip(memberShip);
  }

  public String toString(){
    return String.format("%s is a %s member", this.name, this.memberShip);
  }

  public boolean equals(User u2){
    return this.name == u2.name && this.memberShip == u2.memberShip;
  }
  
}

// 11. Extending a Class with Inheritance

import java.util.ArrayList;
import java.util.List;

// Classe principale
class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Liste des étudiants
        Student.admins = new ArrayList<Student>();
        
        // Ajout des étudiants dans la liste des admins
        Student.admins.add(new Student("Jack", "bronze"));
        Student.admins.add(new Student("Jill", "gold"));
        Student.admins.add(new Student("Jake", "silver"));
                      
        // Affichage du nom des étudiants
        System.out.println(Student.admins.get(0).get_name());
        System.out.println(Student.admins.get(1).get_name());

        System.out.println("printing students :");
        for (Student student : Student.admins){
            System.out.println(student.get_name());
        }
    }
}

// Classe Student
public class Student extends User {
    // Liste des étudiants administrateurs
    public static List<Student> admins = new ArrayList<>();

    // Constructeurs
    public Student() {
        set_name("default");
    }

    public Student(String name, String memberShip) {
        set_name(name);
        setMemberShip(memberShip);
    }
}

// Classe User
public class User {
    private String name;
    String memberShip;

    void set_name(String name) {
        this.name = name;
    }

    String get_name() {
        return this.name;
    }

    void setMemberShip(String memberShip) {
        this.memberShip = memberShip;
    }

    public String getMemberShip() {
        return memberShip;
    }

    public String toString() {
        return String.format("%s is a %s member", this.name, this.memberShip);
    }

    public boolean equals(User u2) {
        return this.name.equals(u2.name) && this.memberShip.equals(u2.memberShip);
    }
}

// 12. polymorphisme

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create instances of Student and Teacher
        Student s = new Student();
        s.set_name("student");

        Teacher t = new Teacher();
        t.set_name("teacher");

        // Initialize the list of admins
        User.admins = new ArrayList<User>();
        User.admins.add(s);
        User.admins.add(t);
        User.admins.add(new User("Caleb"));
        User.admins.add(new User("You"));
        User.admins.add(new User("Sally"));

        // Iterate over the list to verify users
        for (User u : User.admins) {
            u.verify();
        }
    }
}

// User class
class User {
    protected String name;
    private boolean _verified = false;
    public static List<User> admins;

    public User() {
        set_name("default");
    }

    public User(String name) {
        set_name(name);
    }

    void set_name(String name) {
        this.name = name;
    }

    String get_name() {
        return this.name;
    }

    void set_verified(boolean verified) {
        _verified = verified;
    }

    boolean get_verified() {
        return _verified;
    }

    void verify() {
        System.out.println("User verification process");
        set_verified(true);
    }
}

// Student class
class Student extends User {
    @Override
    void verify() {
        System.out.println("Verifying through email for student: " + get_name());
        set_verified(true);
    }
}

// Teacher class
class Teacher extends User {
    @Override
    void verify() {
        System.out.println("Teacher verified: " + get_name());
        set_verified(true);
    }
}
























  











  



















