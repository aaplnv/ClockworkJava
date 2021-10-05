package com.nomust.Tasks.Task3;

import com.nomust.Tasks.Task;

public class Task3 extends Task {
    @Override
    public String getName() {
        return "Task 3 (new)";
    }

    @Override
    public void Run() {
        System.out.println("Running tests of task 3...");

        TestShape.main();

        pressAnyKey();
    }
}
