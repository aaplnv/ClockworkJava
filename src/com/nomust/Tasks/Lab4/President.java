package com.nomust.Tasks.Lab4;

public class President implements INameable{
    private String name;
    public President(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "President: " +
                "name='" + name + '\'';
    }
}
