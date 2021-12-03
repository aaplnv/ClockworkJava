package com.nomust.Tasks.Lab8;

import com.nomust.Tasks.Task;

public class Lab8 extends Task {
    @Override
    public String getName() {
        return "Lab 8 (new)";
    }

    @Override
    public void Run() {
        FileReader.main(null);

        pressAnyKey();
    }
}
