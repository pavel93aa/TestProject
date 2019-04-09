package TestProjectPackage;

public class Cat extends Feline implements Pet {

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

}
