package com.nomust.Tasks.Task5;

import com.nomust.Tasks.Task;

import java.util.Scanner;

public class Task5 extends Task {
    @Override
    public String getName() {
        return "Task 5";
    }

    @Override
    public void Run() {
        System.out.println("GetCount: ");
        System.out.println("Enter sequence (0 to finish)");

        getCount(0, 0);
        System.out.println("\n\nGetMaximum: ");
        System.out.println("Enter sequence (0 to finish)");
        System.out.println(getMaximum());
        System.out.println("\n\nGetReverse: ");
        System.out.println("Enter sequence (0 to finish)");

        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt(); // TODO: Keyboard reader with error handler (how to code it without most of console functions?)
        System.out.println(getReverse(n, 0));

        pressAnyKey();
    }

    static void getCount(int max, int count)
    {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt(); // TODO: Keyboard reader with error handler (how to code it without most of console functions?)
        if (n == 0) {
            System.out.println(max + ", " + count);
            return;
        }
        if (n > max) {
            getCount(n, 1);
        } else if (n == max) {
            getCount(max, count + 1);
        } else {
            getCount(max, count);
        }
    }

    public static int getMaximum() {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt(); // TODO: Keyboard reader with error handler (how to code it without most of console functions?)
        if (n == 0) {
            return 0;
        }
        else {
            return Math.max(n, getMaximum());
        }
    }

    public static int getReverse(int n, int i) {
        return (n==0) ? i : getReverse( n/10, i*10 + n%10 );
    }
}