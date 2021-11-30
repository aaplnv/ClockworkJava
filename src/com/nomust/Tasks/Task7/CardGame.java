package com.nomust.Tasks.Task7;

import java.util.LinkedList;
import java.util.Queue;

public class CardGame {
    private Queue<Card> deck;

    public CardGame() {
        deck = new LinkedList<>();
    }

    public String getDeckDebug(){
        return deck.toString();
    }

    public void addCard(Card card) {
        deck.add(card);
    }

    public Card getTopCard() {
        var card = deck.element();
        deck.poll();
        return card;
    }

    public Boolean isEmpty() {
       // return deck.poll() == null
        if (deck.toString() == "[]") return true;
        else return false;
    }
}