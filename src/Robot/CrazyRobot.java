package Robot;

import java.util.Random;

public class CrazyRobot extends Robot{

    public CrazyRobot() {
        super();
    }

    public void boot() {
        Random r = new Random();
        String str = getUnitName();

            for(int i=0;i<7;i++){
                    char ch = str.charAt(r.nextInt(str.length()) );
                    System.out.print(ch);
                }
    }

    @Override
    public String toString() {
        return "CrazyRobot{}";
    }
}
