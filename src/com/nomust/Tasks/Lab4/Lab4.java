package com.nomust.Tasks.Lab4;

import com.nomust.Tasks.Lab3.Condom;
import com.nomust.Tasks.Lab3.Doll;
import com.nomust.Tasks.Lab3.Item;
import com.nomust.Tasks.Task;

import java.util.ArrayList;
import java.util.List;

public class Lab4 extends Task {
    @Override
    public String getName() {
        return "Lab 4";
    }

    @Override
    public void Run() {

            List<INameable> list = new ArrayList<>();
            list.add(new President("Vladimir Vladimirovich"));
            list.add(new President("Vladimir Vladimirovich (Udmurt)"));
            list.add(new President("Vladimir Vladimirovich (Banketnyy)"));
            list.add(new Gopnik("Vasyok"));
            list.add(new Dog("sharick"));
            list.add(new Dog("Vilya"));

            System.out.println("Welcome to xShop!");
            list.forEach(item -> {
                System.out.println(item.toString());
            });

            pressAnyKey();
    }
}
