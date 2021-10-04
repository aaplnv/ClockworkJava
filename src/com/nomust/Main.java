package com.nomust;

import com.nomust.Tasks.Lab1.Lab1;
import com.nomust.Tasks.Lab2.Lab2;
import com.nomust.Tasks.Task;
import com.nomust.Tasks.Task1.Task1;
import com.nomust.Tasks.Task2.Task2;
import com.nomust.Tasks.Task3.Task3;
import com.nomust.Tasks.Task4.Task4;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    // This is main menu
    public static void main(String[] args) {
        // Initiations here
        Scanner keyboard = new Scanner(System.in);

        // This is an array of tasks
        // Connect new Tasks and Labs here
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task1());
        tasks.add(new Task2());
        tasks.add(new Lab1());
        tasks.add(new Lab2());
        tasks.add(new Task3());
        tasks.add(new Task4());

        // Run main menu
        int key = 0;
        do {
            System.out.println("========== Main menu ==========");

            for (int i=1; i <= tasks.size(); i++ ){
                System.out.println(i + ". " + tasks.get(i-1).GetName());
            }
            System.out.println("0. Exit");
            System.out.print("> ");

            try{
                key = keyboard.nextInt();
                if (key > tasks.size()) throw new Exception();
            }
            catch (Exception ex)
            {
                System.out.print("Bullshit provided exception..." + ex);
                continue;
            }
            System.out.println();

            if (key != 0) tasks.get(key-1).Run();

        } while (key != 0);
    }
}
