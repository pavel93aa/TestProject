package TestProjectPackage;

abstract public class Feline extends Animal implements Predator {

    @Override
    public void hunt() {
        System.out.println(getName() + " охотится по кошачьи");
    }

    public void run() {
        System.out.println(getName() + " бежит по кошачьи");
    }
}


