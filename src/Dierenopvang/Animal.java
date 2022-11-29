package Dierenopvang;

import java.util.Map;

public abstract class Animal implements Vaccinateable, Treatable {
    protected Map<Disease, Boolean> isVaccinated;
    protected boolean isClean;
    protected int age;
    protected String name;
    protected int animalNumber;

    public Animal() {
    }

    @Override
    public void vaccinateAnimal(Disease) {
        this.isVaccinated = Disease + true;



    }
}
