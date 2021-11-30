package com.nomust.Tasks.Task7;

import com.nomust.Tasks.Task;

public class Task7 extends Task {
    @Override
    public String getName() {
        return "Task 7";
    }

    @Override
    public void Run() {
        System.out.println(WarGame.Play());

        pressAnyKey();
    }
}