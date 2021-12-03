package com.nomust;

import com.nomust.Tasks.Lab1.Lab1;
import com.nomust.Tasks.Lab2.Lab2;
import com.nomust.Tasks.Lab3.Lab3;
import com.nomust.Tasks.Lab4.Lab4;
import com.nomust.Tasks.Lab5.Lab5;
import com.nomust.Tasks.Lab6.Lab6;
import com.nomust.Tasks.Lab7.Lab7;
import com.nomust.Tasks.Lab8.Lab8;
import com.nomust.Tasks.Task1.Task1;
import com.nomust.Tasks.Task2.Task2;
import com.nomust.Tasks.Task3.Task3;
import com.nomust.Tasks.Task4.Task4;
import com.nomust.Tasks.Task5.Task5;
import com.nomust.Tasks.Task6.Task6;
import com.nomust.Tasks.Task7.Task7;


import java.util.ArrayList;
import java.util.List;

public class Main {

    // This is main menu
    public static void main(String[] args) {
        // This is an array of tasks
        // Connect new Tasks and Labs here
        List<IExecutable> tasks = new ArrayList<>();
        tasks.add(new Task1());
        tasks.add(new Task2());
        tasks.add(new Lab1());
        tasks.add(new Lab2());
        tasks.add(new Task3());
        tasks.add(new Task4());
        tasks.add(new Lab3());
        tasks.add(new Lab4());
        tasks.add(new Task5());
        tasks.add(new Task6());
        tasks.add(new Lab5());
        tasks.add(new Lab6());
        tasks.add(new Task7());
        tasks.add(new Lab7());
        tasks.add(new Lab8());

        Menu mainMenu = new Menu(tasks);

        mainMenu.open("========== Main menu ==========");
    }
}
