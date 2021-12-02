package com.nomust.Tasks.Lab7;

import com.nomust.Tasks.Task;

public class Lab7 extends Task {
    @Override
    public String getName() {
        return "Lab 7 (new)";
    }

    @Override
    public void Run() {
        var list = new MyList<String>(5);
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        System.out.println(list.get(3));
        System.out.println(list.indexOf("two"));
        list.remove(2);
        System.out.println(list.getSize());

        pressAnyKey();
    }
}
