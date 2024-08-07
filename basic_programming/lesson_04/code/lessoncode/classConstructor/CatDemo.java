package classConstructor;

public class CatDemo {
    public static void main(String[] args) {
        Cat myCat = new Cat();

        myCat.age = 5 ;
        myCat.catMeow();
        myCat.catBirthday();

        Cat mySecondCat = new Cat() ;
        mySecondCat.age = 2;

        mySecondCat.catBirthday();
    }
}
