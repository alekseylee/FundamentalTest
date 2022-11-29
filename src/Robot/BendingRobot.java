package Robot;

public class BendingRobot extends Robot{
    private double maxBendAngle;
    private String unitName;


    public BendingRobot(String unitName, double maxBendAngle) {
        super(unitName);
        this.maxBendAngle = maxBendAngle;
    }

    public double getMaxBendAngle() {
        return maxBendAngle;
    }

    @Override
    public String getUnitName() {
        return unitName;
    }

    public void bend(double myBendAngle) {

        if(myBendAngle<=maxBendAngle || myBendAngle == 0) {
            System.out.println("The bending succeeded with the requested angle.");
        } else {
            System.out.println("You input incorrect angle value");
        }
    }

    @Override
    public String toString() {
        return "BendingRobot{" +
                "maxBendAngle=" + maxBendAngle +
                ", unitName='" + unitName + '\'' +
                '}';
    }
}
