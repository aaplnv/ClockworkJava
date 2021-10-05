package com.nomust.Tasks.Lab4;

public class Dog implements INameable{
    private String name;
    public Dog(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dog: " +
                "name='" + name + '\'';
    }
}
