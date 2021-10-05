package com.nomust;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public List<IExecutable> menuItems;
    Scanner keyboard = new Scanner(System.in);

    public Menu(List<IExecutable> menuItems) {
        this.menuItems = menuItems;
    }

    public void open(String opening) {
        int key = 0;
        do {
            System.out.println(opening);

            for (int i=1; i <= menuItems.size(); i++ ){
                System.out.println(i + ". " + menuItems.get(i-1).getName());
            }
            System.out.println("0. Exit");
            System.out.print("> ");

            try{
                key = keyboard.nextInt();
                if (key > menuItems.size()) throw new Exception();
            }
            catch (Exception ex)
            {
                System.out.print("Bullshit provided exception..." + ex);
                continue;
            }
            System.out.println();

            if (key != 0) menuItems.get(key-1).Run();

        } while (key != 0);
    }
}
