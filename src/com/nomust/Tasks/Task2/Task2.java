package com.nomust.Tasks.Task2;

import com.nomust.Tasks.Task;

public class Task2 extends Task {
    public String GetName() {
        return "Task 2";
    }
    public void Run(){
        System.out.println("Running tests of task 2");

        TestAuthors.RunTest();

        pressAnyKey();
    }
}
