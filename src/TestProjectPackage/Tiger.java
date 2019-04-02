package TestProjectPackage;

public class Tiger extends Animal implements Predator {

    Tiger() {
        super();
    }

    Tiger(int size, String name) {
        this.setSize(size);
        this.setName(name);
    }

    @Override
    public void say() {
        System.out.println("Арррр");
    }

    @Override
    public void hunt() {
        System.out.println(getName() + " охотится");
    }
}
