package TestProjectPackage;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return size == animal.size &&
                Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, name);
    }

}
