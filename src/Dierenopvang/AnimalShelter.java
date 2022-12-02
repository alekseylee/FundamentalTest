package Dierenopvang;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class AnimalShelter {
    private List<Animal> animals = new ArrayList<>();
    private int animalId;

    public AnimalShelter() {
    }

    public AnimalShelter(int animalId) {
        this.animalId = animalId;
    }

    public int getAnimalId() {
        return animalId;
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }
    public void addAnimal(Animal animal){
        animals.add(animal);
        animal.treatAnimal();
        animal.setAnimalNumber(animalId+=1);
    }

    public void printAnimals(){
        animals.forEach(animal -> System.out.println(animal));
    }

    public void sortAnimals() {
        animals.sort(Comparator.comparing(Animal::getAnimalNumber));
        System.out.println(animals);
    }

    public void sortAnimalsByName() {
        animals.sort(Comparator.comparing(Animal::getName));
        System.out.println(animals);
    }
    public void sortAnimalsByAge() {
        animals.sort(Comparator.comparing(Animal::getAge));
        System.out.println(animals);
    }
    public void printAnimalsNotVaccinated(Disease disease) {
        for(Animal animal : animals) {
            if (animal.getIsVaccinated().get(disease)==false) {
                System.out.println(animal.getName() + " with animal number " + animal.getAnimalNumber()
                        + " is not vaccinated " + disease);
            }
        }
    }

    public Animal findAnimal(int animalNumber){
        if(animalId == getAnimalId()) {
            System.out.println("You find animal with " + animalNumber);
        }
        return null;
    }

    public Animal findAnimal(String name){

        if(animals.contains(name) == name.equals(name)) {
            System.out.println("You find animal with " +name);
        }
        return null;
    }

    public void treatAnimal(int animalId) {
        for (Animal animal : animals) {
            if (animal.getAnimalNumber()==animalId) {
                animal.treatAnimal();
            }
        }

    }
    public void treatAnimal(String name) {
        for (Animal animal : animals) {
            if (animal.getName()==name) {
                animal.treatAnimal();
            }
        }

    }
    public void treatAllAnimals() {
        for (Animal animal : animals) {
            animal.treatAnimal();
        }
    }

    public Animal findOldestAnimal(){
        animals.sort(Comparator.comparing(Animal::getAge).reversed());
        return animals.get(0);
    }

    public int countAnimals(){
        return animals.size();
    }

}
