package com.nomust.Tasks.Task7;

public class Card {

    public Card(int id) {
        this.id = id;
    }

    private int id;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id='" + id + '\'' +
                '}';
    }
}