package Robot;

public class LiftingRobot extends Robot {
    private double maxLiftHeight;

    public LiftingRobot(String unitName, double maxLiftHeight) {
        super(unitName);
        this.maxLiftHeight = maxLiftHeight;
    }

    public void lift(double lifting) {
        if (lifting < maxLiftHeight) {
            System.out.println("Lifting succeeded with the requested height");
        } else {
            System.out.println("You input incorrect height");
        }
    }

    @Override

    public String toString() {

        return "BendingRobot {" +

                " unitName = '" + super.getUnitName() + '\'' +

                " maxBendAngle = " + maxLiftHeight +

                '}';

    }
}
