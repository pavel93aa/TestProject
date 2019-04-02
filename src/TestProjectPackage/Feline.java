package TestProjectPackage;

abstract public class Feline extends Animal implements Predator {

    @Override
    abstract public void say();

    @Override
    public void hunt() {
        System.out.println(getName() + " охотится по кошачьи");
    }

    public void run() {
        System.out.println(getName() + " бежит по кошачьи");
    }
}


