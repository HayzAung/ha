package com.haung.project.Animal;

public abstract class Animal {
    public String name;
    public String location;
    public String type;
    private String age;

    public Animal() {

    }

    public Animal(String name, String location, String type, String age) {
        this.name = name;
        this.location = location;
        this.type = type;
        this.age = age;
    }

    public int numberOfLegs() {
        return 4;
    }
    public String food (){
        return "bug";
    }
}
