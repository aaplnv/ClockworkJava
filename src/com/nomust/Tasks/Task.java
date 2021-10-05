package com.nomust.Tasks;

import com.nomust.IExecutable;

public abstract class Task implements IExecutable {
    public abstract String getName();
    public abstract void Run();

    public void pressAnyKey() {
        System.out.println("Press Enter to continue...");
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {}
    }
}
