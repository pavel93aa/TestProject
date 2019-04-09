package TestProjectPackage;

import java.util.Objects;

public class Duck extends Animal {

    private boolean canFly;

    Duck() {
        super();
    }

    Duck(int size, String name, boolean canFly) {
        this.setSize(size);
        this.setName(name);
        this.canFly = canFly;
    }

    public boolean getCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    @Override
    public void status() {
        System.out.println("Size = " + super.getSize() + " Name = " + super.getName() + " CanFly = " + canFly);
    }

    @Override
    public void say() {
        System.out.println("Кря-кря");
    }

    public void fly() {
        if (canFly) {
            System.out.println(getName() + " летит");
        } else System.out.println(getName() + " не летит");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Duck duck = (Duck) o;
        return canFly == duck.canFly;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), canFly);
    }
}
