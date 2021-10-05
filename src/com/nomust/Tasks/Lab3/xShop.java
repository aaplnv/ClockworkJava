package com.nomust.Tasks.Lab3;

import java.util.ArrayList;
import java.util.List;

public class xShop {
    public static void catalog() {
        List<Item> catalog = new ArrayList<>();
        catalog.add(new Doll("Змей горырыч", 100, 20));
        catalog.add(new Doll("Илья Муромец", 99, 100));
        catalog.add(new Doll("Сила трёх коней", 160, 30));
        catalog.add(new Condom("Гусарские", 60, 10));
        catalog.add(new Condom("Визит", 70, 15));
        catalog.add(new Condom("Шарики для метания с крыши", 40, 30));

        System.out.println("Welcome to xShop!");
        catalog.forEach(item -> {
            System.out.println(item.toString());
        });
    }
}
