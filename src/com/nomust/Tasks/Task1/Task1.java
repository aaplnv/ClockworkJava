package com.nomust.Tasks.Task1;

import com.nomust.Tasks.Task;

public class Task1 extends Task {
    public String getName() {
        return "Task 1";
    }
    public void Run(){
        System.out.println("Running tests of task 1");
        TestCoolProger.RunTest();

        pressAnyKey();
    }
}
