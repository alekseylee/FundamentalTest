package Robot;

public abstract class Robot {
    private String unitName;

    public Robot() {
        this.unitName = "nameless Robot";
    }


    public Robot(String unitName) {
        this.unitName = unitName;
    }

    public String getUnitName() {
        return unitName;
    }

    public void boot() {
        System.out.println(unitName + "  the robot is booting. ");
    }
}
