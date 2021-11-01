package com.nomust.Tasks.Lab5;

import com.nomust.Tasks.Task;

import javax.swing.*;

public class Lab5 extends Task {
    @Override
    public String getName() {
        return "Lab5 (new)";
    }

    @Override
    public void Run() {
        MainFrame mf = new MainFrame();
        mf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mf.setVisible(true);
    }
}
