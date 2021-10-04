package com.nomust.Tasks.Task1;

import java.util.ArrayList;
import java.util.List;

public class TestCoolProger {
    public static void RunTest() {
        List<CoolProger> inbo1520 = new ArrayList<>();
        inbo1520.add(new CoolProger("Aleksey", false, 10000));
        inbo1520.add(new CoolProger("Pavel", true, 1000000));
        inbo1520.add(new CoolProger("Elder", false, 0));

        inbo1520.forEach(coolProger -> {
            System.out.println(coolProger);
        });
    }


}
