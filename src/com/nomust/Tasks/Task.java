package com.nomust.Tasks;

public abstract class Task {
    public abstract String GetName();
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
