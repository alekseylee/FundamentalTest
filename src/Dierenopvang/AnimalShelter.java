package Dierenopvang;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class AnimalShelter {
    private List<Animal> animals;
    private int animalId;

    public AnimalShelter() {
    }

    public AnimalShelter(List<Animal> animals, int animalId) {
        this.animals = animals;
        this.animalId = animalId;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public int getAnimalId() {
        return animalId;
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }

    public void sortAnimals() {
        animals.sort(Comparator.comparing(animal -> getAnimalId()));
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
//        animals.sort(Comparator.comparing(Animal::));
//        System.out.println(animals);
    }

    public Animal findAnimal(int animalId){
        if(animalId == getAnimalId()) {
            System.out.println("Id correct, your animal is here");
        }
        return null;
    }

    public Animal findAnimal(String name){

        if(animals.contains(name) == name.equals(name)) {
            System.out.println("Your animal is here");
        }
        return null;
    }

    public void treatAnimal(int animalId) {
        this.animalId = getAnimalId();
    }
    public void treatAnimal(String name) {

    }
    public void treatAllAnimals() {

    }

}
