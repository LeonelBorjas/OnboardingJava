package day_03;
import java.lang.System;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person {

    String firstName = "Leonel";
    String lastName = "Borjas";
    String identityCard = "Dni";

    int age = 23;
    double height = 1.69;
    boolean married = false;

    public List<Pet> pets = new ArrayList<>();


    public Person(String firstName, String lastName, String identityCard, int age, double height, boolean married){
        this.firstName = firstName;
        this.lastName = lastName;
        this.identityCard = identityCard;
        this.age = age;
        this.height = height;
        this.married = married;

    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", identityCard='" + identityCard + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", married=" + married +
                ", pets=" + pets +
                '}';
    }


    public void addPet(Pet pet) {
        pet.setOwner(this);
        pets.add(pet);
    }

    public static void introduceYourself(Person persona) {
        System.out.println("Hola mi nombre es " + persona.getFirstName() +  persona.getLastName());
        System.out.println("Tengo " + persona.getAge() + " años " + "y mido " + persona.getHeight() + " metros de altura");
        if (persona.isMarried()) {
            System.out.println("Estoy casado/a");
        } else {
            System.out.println("No estoy casado/a");
        }
        System.out.println("Mi DNI es 45168763 ");
        for (Pet pet : persona.getPets()) {
            System.out.println(pet.getName() + " es un " + pet.getType() + " y tiene: " + pet.getAge() + " años");
        }
    }

}
