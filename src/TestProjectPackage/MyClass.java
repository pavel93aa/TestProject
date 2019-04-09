package TestProjectPackage;

public class MyClass {

    public static void main(String[] args) {

        Cat cat = new Cat(15, "Мурка");
        Cat cat2 = new Cat(15, "Мурка");
        Duck duck = new Duck(10, "Дональд", true);
        Duck duck2 = new Duck(10, "Дональд", true);
        Tiger tiger = new Tiger(100, "Тигр");
        Tiger tiger2 = new Tiger(100, "Тигр");

        System.out.println(cat.hashCode() + " " + cat2.hashCode());
        System.out.println(cat.equals(cat2) && cat2.equals(cat));

        System.out.println(tiger.hashCode() + " " + tiger2.hashCode());
        System.out.println(tiger.equals(tiger2) && tiger2.equals(tiger));

        System.out.println(duck.hashCode() + " " + duck2.hashCode());
        System.out.println(duck.equals(duck2) && duck2.equals(duck));
    }
}

