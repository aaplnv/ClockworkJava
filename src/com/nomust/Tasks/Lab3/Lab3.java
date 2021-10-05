package com.nomust.Tasks.Lab3;

import com.nomust.Tasks.Task;

public class Lab3 extends Task {
    @Override
    public String getName() {
        return "Lab 3";
    }

    @Override
    public void Run() {
        xShop.catalog();

        pressAnyKey();
    }
}
