
package day_02;
import java.lang.System;
import java.util.Arrays;

public class Person {

    String firstName = "Leonel";
    String lastName = "Borjas";
    String identityCard = "Dni";

    int age = 23;
    double height = 1.69;
    boolean married = false;
    String[] petsName = {"Meno"};

    public Person(String firstName, String lastName, String identityCard, int age, double height, boolean married, String[] petsName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.identityCard = identityCard;
        this.age = age;
        this.height = height;
        this.married = married;
        this.petsName = petsName;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public void introduceYourself() {
        System.out.println("Hola mi nombre es " + firstName +  lastName);
        System.out.println("Tengo " + age + " años " + "y mido " + height + " metros de altura");
        System.out.println("No estoy casado/a");
        System.out.println("Mi DNI es 45168763 ");
        System.out.println("Mis mascotas se llaman " + Arrays.toString(petsName));
    }

}

