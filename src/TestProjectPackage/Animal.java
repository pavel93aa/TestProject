package TestProjectPackage;

public abstract class Animal {
    private int size;
    private String name;

    Animal() {
    }

    Animal(int size, String name) {
        this.size = size;
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract public void status();

    abstract public void say();
}
