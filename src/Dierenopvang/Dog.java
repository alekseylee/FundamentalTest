package Dierenopvang;

public class Dog extends Animal{
    private boolean hasFoulBreath;

    public Dog() {
    }

    public Dog(boolean isClean, int age, String name, int animalNumber, boolean hasFoulBreath) {
        super(isClean, age, name, animalNumber);
        this.hasFoulBreath = hasFoulBreath;
    }

    public boolean HasFoulBreath() {
        return hasFoulBreath;
    }

    @Override
    public void treatAnimal() {
        super.treatAnimal();
        hasFoulBreath=false;
    }

    @Override
    public String toString() {
        return "Dog{" +
                super.toString() +
                "hasFoulBreath=" + hasFoulBreath +
                '}';
    }
}
