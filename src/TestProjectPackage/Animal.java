package TestProjectPackage;

public abstract class Animal {
    private int size;
    private String name;

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

    public void status() {
        System.out.println("Size = " + size + " Name = " + name);
    }

    public void run() {
        System.out.println(name + " бежит");
    }

    abstract public void say();
}
