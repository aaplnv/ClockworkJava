package com.nomust.Tasks.Task4;

import com.nomust.Tasks.Task;

public class Task4 extends Task {
    @Override
    public String GetName() {
        return "Task 4";
    }

    @Override
    public void Run() {
        LabExample.openWindow();
    }
}
