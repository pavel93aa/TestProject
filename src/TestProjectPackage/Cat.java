package TestProjectPackage;

public class Cat extends Animal {

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

    public void run() {
        System.out.println("Кошка бежит");
    }
}
