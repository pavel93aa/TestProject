package TestProjectPackage;

public class Cat extends Animal implements Pet {

    Cat() {
        super();
    }

    Cat(int size, String name) {
        super(size, name);
    }

    @Override
    public void status() {
        System.out.println("Size = " + super.getSize() + " Name = " + super.getName());
    }

    @Override
    public void say() {
        System.out.println("Мяу-мяу");
    }

    @Override
    public void play() {
        System.out.println("Кошка играет");
    }

    public void run() {
        System.out.println("Кошка бежит");
    }
}
