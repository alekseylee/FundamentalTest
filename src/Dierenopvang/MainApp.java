package Dierenopvang;

public class MainApp {
    public static void main(String[] args) {

        Cat cat = new Cat(true,77,"CatWoman",555,true);
        Dog dog = new Dog(true,7,"SnoopDogg",444,false);
        Monkey monkey = new Monkey(true, 155, "MonkeyKing",333,true);
        Monkey monkey2 = new Monkey(true,9,"Uahauaua",888,true);
        Dog dog2 = new Dog(true,1,"Bobby",111,false);
        Dog dog3 = new Dog(true,6,"Rocky",999,false);
        Dog dog4 = new Dog(false,66,"Candy",001,true);
        Cat cat2 = new Cat(true,23,"Kitty",007,false);
        Cat cat3 = new Cat(false,12,"Snowy",123,false);
        Cat cat4 = new Cat(true,55,"Catrina",777,false);

        AnimalShelter animalShelter = new AnimalShelter(0);

        animalShelter.addAnimal(cat);
        animalShelter.addAnimal(dog);
        animalShelter.addAnimal(monkey);
        animalShelter.addAnimal(monkey2);
        animalShelter.addAnimal(dog2);
        animalShelter.addAnimal(dog3);
        animalShelter.addAnimal(dog4);
        animalShelter.addAnimal(cat2);
        animalShelter.addAnimal(cat3);
        animalShelter.addAnimal(cat4);

        animalShelter.sortAnimalsByAge();
        animalShelter.printAnimals();
        System.out.println("-------------------------------------");
        animalShelter.sortAnimalsByName();
        animalShelter.printAnimals();
        System.out.println("--------------------------------------");

        System.out.println(animalShelter.findAnimal(777));
    }
}
