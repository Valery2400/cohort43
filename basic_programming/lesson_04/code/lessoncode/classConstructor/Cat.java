package classConstructor;

public class Cat {
    int age;

    public void catMeow() {
        System.out.println("Meow!!!");
    }
    public void catBirthday() {
        System.out.println("My cat have birthday today!");
        System.out.println("It was " + age + " y.o.");
        age = age + 1 ;
        System.out.println("and now " + age + " y.o.");

    }


}
