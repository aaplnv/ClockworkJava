package com.nomust.Tasks.Lab6;

import com.nomust.Tasks.Task;

public class Lab6 extends Task {

    @Override
    public String getName() {
        return "Lab 6 (new)";
    }

    @Override
    public void Run() {
        var application = new App();
        application.Run();
    }
}
