package TestProjectPackage;

public class Cat extends Animal implements Pet, Predator {

    Cat() {
        super();
    }

    Cat(int size, String name) {
        this.setSize(size);
        this.setName(name);
    }

    @Override
    public void say() {
        System.out.println("Мяу-мяу");
    }

    @Override
    public void play() {
        System.out.println(getName() + " играет");
    }

    @Override
    public void hunt() {
        System.out.println(getName() + " охотится");
    }
}
