package Dierenopvang;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public abstract class Animal implements Vaccinateable, Treatable {
    protected Map<Disease, Boolean> isVaccinated = new HashMap<>(){
        {put(Disease.HEPATITISA, false); put(Disease.FLUE,false); put(Disease.POLIO,false);
            put(Disease.CHICKENPOCKS,false);}};
    protected boolean isClean;
    protected int age;
    protected String name;
    protected int animalNumber;

    public Animal() {
    }

    public Animal(boolean isClean, int age, String name, int animalNumber) {
        this.isVaccinated = isVaccinated;
        this.isClean = isClean;
        this.age = age;
        this.name = name;
        this.animalNumber = animalNumber;
    }

    public Map<Disease, Boolean> getIsVaccinated() {
        return isVaccinated;
    }

    public void setIsVaccinated(Disease disease) {
        isVaccinated.replace(disease,false);
    }

    public boolean isClean() {
        return isClean;
    }


    public int getAge() {
        return age;
    }


    public String getName() {
        return name;
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

    @Override
    public String toString() {
        return "Animal{" +
                "isVaccinated=" + isVaccinated +
                ", isClean=" + isClean +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", animalNumber=" + animalNumber +
                '}';
    }
}
