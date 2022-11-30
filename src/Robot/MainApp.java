package Robot;

public class MainApp {
    public static void main(String[] args) {

        BendingRobot robot1 = new BendingRobot("Bendingnio", 360);
        robot1.bend(300);
        robot1.bend(400);


        LiftingRobot robot2 = new LiftingRobot("Arnold Schwarzenegger", 1000);


        robot2.lift(900);
        robot2.lift(1000000);


        CrazyRobot robot3 = new CrazyRobot();


        robot3.boot();


    }
}
