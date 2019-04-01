package TestProjectPackage;

public class Duck extends Animal {

    private boolean canFly;

    Duck() {
        super();
    }

    Duck(int size, String name, boolean canFly) {
        super(size, name);
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
            System.out.println("Утка летит");
        } else System.out.println("Утка не летит");
    }

}
