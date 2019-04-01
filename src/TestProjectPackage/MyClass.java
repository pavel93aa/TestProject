package TestProjectPackage;

public class MyClass {
    public static void main(String[] args) {
        System.out.println("TEST");
        Cat cat = new Cat(10, "Мурка");
        Duck duck = new Duck(5, "Дональд", true);

        cat.status();
        cat.say();
        cat.run();
        cat.play();

        duck.status();
        duck.say();
        duck.fly();
    }
}

