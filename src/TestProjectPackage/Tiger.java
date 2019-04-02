package TestProjectPackage;

public class Tiger extends Feline {

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
}
