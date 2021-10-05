package com.nomust.Tasks.Task5;

import com.nomust.Tasks.Task;

import java.util.Scanner;

public class Task5 extends Task {
    @Override
    public String getName() {
        return "Task 5 (new)";
    }

    @Override
    public void Run() {
        System.out.println("Enter sequence (0 to finish)");
            getCount(0, 0);
            pressAnyKey();
    }

    static void getCount(int max, int count)
    {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt(); // TODO: Keyboard reader with error handler (how to code it without most of console functions?)
        if (n == 0) {
            System.out.println(max + ", " + count);
        }
        if (n > max) {
            getCount(n, 1);
        } else if (n == max) {
            getCount(max, count + 1);
        } else {
            getCount(max, count);
        }
    }
}
