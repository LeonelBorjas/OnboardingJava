package day_02;

public class Main {

    public static void  main(String[] args){
        String[] pets = {"Meno"};
        Person Person = new Person("Leonel", "Borjas","Dni", 23, 1.69, false, pets);
        Person.introduceYourself();

        String[] pets2 = {"cici", "Foxy", "Peluchin", "Duquesa", "Toto", "Princesa", "Chuchy", "Chocolate"};
        Person Person2 = new Person("Saudy", "Mejia", "45459489", 21, 1.57, false, pets2);
        Person2.introduceYourself();
    }
}