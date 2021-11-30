/*Напишите программу в виде консольного приложения, которая
        моделирует карточную игру «пьяница» и определяет, кто выигрывает. В игре
        участвует 10 карт, имеющих значения от 0 до 9, большая карта побеждает
        меньшую; карта «0» побеждает карту «9».
        Карточная игра “ В пьяницу”. В этой игре карточная колода раздается
        поровну двум игрокам. Далее они открывают по одной верхней карте, и тот, чья
        карта старше, забирает себе обе открытые карты, которые кладутся под низ его
        колоды. Тот, кто остается без карт, - проигрывает.
        Для простоты будем считать, что все карты различны по номиналу и что
        самая младшая карта побеждает самую старшую карту (“шестерка берет туз”).
        Игрок, который забирает себе карты, сначала кладет под низ своей колоды
        карту первого игрока, затем карту второго игрока (то есть карта второго игрока
        оказывается внизу колоды).
        Входные данные.
        Программа получает на вход две строки: первая строка содержит 5 карт
        первого игрока, вторая - 5 карт второго игрока. Карты перечислены сверху вниз,
        то есть каждая строка начинается с той карты, которая будет открыта первой.
        Выходные данные.
        Программа должна определить, кто выигрывает при данной раздаче, и
        вывести слово first или second, после чего вывести количество ходов, сделанных
        до выигрыша. Если на протяжении 106 ходов игра не заканчивается, программа
        должна вывести слово botva */

package com.nomust.Tasks.Task7;

import java.util.Scanner;

public class WarGame {
    public static String Play(){
        System.out.println("Enter cards for first player");
        var firstDeck = inputCards();
        System.out.println("Enter cards for second player");
        var secondDeck = inputCards();


        for (int i = 1; i < 107; i++) {
            var firstcard = firstDeck.getTopCard();
            var secondcard = secondDeck.getTopCard();

            if ((firstcard.getId() > secondcard.getId() || (firstcard.getId() == 0 && secondcard.getId() == 9))&& !(firstcard.getId() == 9 && secondcard.getId() == 0)) {
                firstDeck.addCard(firstcard);
                firstDeck.addCard(secondcard);
            } else {

                secondDeck.addCard(firstcard);
                secondDeck.addCard(secondcard);
            }

            if (firstDeck.isEmpty()) return "Second player win at " + i + " move";
            if (secondDeck.isEmpty()) return "First player win at " + i + " move";
        }
        return "No winners!";
    }

    public static CardGame inputCards(){
        Scanner keyboard = new Scanner(System.in);
        var deck = new CardGame();
        for(int i = 0; i < 5; i++){
            deck.addCard(new Card(keyboard.nextInt())); // TODO: Keyboard reader with error handler (how to code it without most of console functions?)
        }
        return deck;
    }
}
