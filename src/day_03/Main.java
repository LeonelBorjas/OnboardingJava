package day_03;
import static day_03.Person.introduceYourself;
public class Main {
    public static void main(String[] args) {
        Person persona1 = new Person("Leonel", "Borjas","43493934", 23, 1.69, false);
        Person persona2 = new Person("Saudy", "Mejia", "45459489", 21, 1.57, false);
        Pet mascota1 = new Pet("Chocolate", 4, PetType.DOG);
        Pet mascota2 = new Pet("Meno", 1, PetType.DOG);
        Pet mascota3 = new Pet("Princesa", 4, PetType.DOG);
        Pet mascota4 = new Pet("Peluchin", 4, PetType.DOG);
        Pet mascota5 = new Pet("Foxy", 6, PetType.DOG);

        persona1.addPet(mascota2);
        persona2.addPet(mascota1);
        persona2.addPet(mascota3);
        persona2.addPet(mascota4);
        persona2.addPet(mascota5);

        introduceYourself(persona1);
        introduceYourself(persona2);
}
}
