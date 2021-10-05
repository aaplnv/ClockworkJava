package com.nomust.Tasks.Lab4;

public class Gopnik implements INameable{
    private String name;
    public Gopnik(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Gopnik: " +
                "name='" + name + '\'';
    }
}
