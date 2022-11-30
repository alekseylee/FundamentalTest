package Dierenopvang;

import java.util.Arrays;
import java.util.Map;

public abstract class Animal implements Vaccinateable, Treatable {
    protected Map<Disease, Boolean> isVaccinated;
    protected boolean isClean;
    protected int age;
    protected String name;
    protected int animalNumber;

    public Animal() {
    }

    public Animal(Map<Disease, Boolean> isVaccinated, boolean isClean, int age, String name, int animalNumber) {
        this.isVaccinated = isVaccinated;
        this.isClean = isClean;
        this.age = age;
        this.name = name;
        this.animalNumber = animalNumber;
    }

    public Map<Disease, Boolean> getIsVaccinated() {
        return isVaccinated;
    }

    public void setIsVaccinated(Map<Disease, Boolean> isVaccinated) {
        this.isVaccinated = isVaccinated;
    }

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAnimalNumber() {
        return animalNumber;
    }

    public void setAnimalNumber(int animalNumber) {
        this.animalNumber = animalNumber;
    }

    @Override
    public void vaccinateAnimal(Disease disease) {
        isVaccinated.get(disease);
        boolean a = true;
        System.out.println(isVaccinated + " vaccinated " + a);
    }


    @Override
    public void treatAnimal() {
        isClean = true;
        System.out.println("Animal is treated " + isClean);
    }
}
