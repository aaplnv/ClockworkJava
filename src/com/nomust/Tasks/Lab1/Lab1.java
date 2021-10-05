package com.nomust.Tasks.Lab1;

import com.nomust.Tasks.Task;

public class Lab1 extends Task {
    private static final int[] array = {46, 22, 16, 94, 555, 12, 99, 438, 1, 1};
    @Override
    public String getName() {
        return "Lab 1";
    }

    @Override
    public void Run() {
        var forsum = 0;
        for (int i = 0; i < array.length; i++)
        {
            forsum += array[i];
        }

        int i = 0;
        var whilesum = 0;
        while (i < array.length) {
            whilesum += array[i];
            i++;
        }

        i = 0;
        var dowhilesum = 0;
        do {
            dowhilesum += array[i];
            i++;
        } while (i < array.length);

        System.out.println("Results: " +"\n" + "For: " + forsum + "\n" + "While: " + whilesum +"\n" + "Do while: " + dowhilesum + "\n");

        pressAnyKey();
    }
}
