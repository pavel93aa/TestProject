package TestProjectPackage;

public class MyClass {

    public static void main(String[] args) {

        Cat cat = new Cat(10, "Мурка");
        Duck duck = new Duck(5, "Дональд", true);
        Tiger tiger = new Tiger(100, "Тигр");
        RobotCat robotCat = new RobotCat(228, true);

        cat.status();
        cat.run();
        cat.hunt();
        cat.play();
        cat.say();

        duck.status();
        duck.run();
        duck.fly();
        duck.say();

        tiger.status();
        tiger.run();
        tiger.hunt();
        tiger.say();

        robotCat.play();
        robotCat.charge();
    }
}

