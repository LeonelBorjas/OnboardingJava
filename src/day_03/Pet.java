package day_03;

import java.lang.reflect.Type;

public class Pet {
    public String name;
    public int age;
    PetType type;
    public Person Owner;

    public Pet(String name, int age, PetType type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public PetType getType() {
        return type;
    }

    public void setType(PetType type) {
        this.type = type;
    }

    public Person getOwner() {
        return Owner;
    }

    public void setOwner(Person owner) {
        Owner = owner;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", type=" + type +
                ", Owner=" + Owner +
                '}';
    }
}
