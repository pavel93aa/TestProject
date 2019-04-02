package TestProjectPackage;

public class RobotCat implements RobotPet {

    private int id;
    private boolean isOn;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    RobotCat() {
    }

    RobotCat(int id, boolean isOn) {
        this.id = id;
        this.isOn = isOn;
    }

    @Override
    public void charge() {
        System.out.println(id + " заряжается");
    }

    @Override
    public void play() {
        if (isOn) {
            System.out.println(id + " играет");
        } else System.out.println(id + " не играет");
    }
}
