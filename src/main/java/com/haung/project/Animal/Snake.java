package com.haung.project.Animal;

public class Snake extends Animal {
    public Snake() {
        super();
    }

    @Override
    public int numberOfLegs() {
        return 0;
    }
    @Override
    public String food () {
       return "rabbit";
    }
}
