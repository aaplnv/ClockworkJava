package com.nomust.Tasks.Lab2;

import com.nomust.Tasks.Task;

public class Lab2 extends Task {
    @Override
    public String GetName() {
        return "Lab 2";
    }

    @Override
    public void Run() {
        TestCircle.main(null);

        pressAnyKey();
    }
}
