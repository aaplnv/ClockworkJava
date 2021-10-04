package com.nomust.Tasks.Task2;

import java.util.ArrayList;
import java.util.List;

public class TestAuthors {
    public static void RunTest() {
        List<Author> fanficAuthors = new ArrayList<>();
        try {
            fanficAuthors.add(new Author("Ray Bradbury", "firebook@outlook.com", 'M'));
        }
        catch (Exception ex)
        {
            System.out.println("ERR: can't add author to list: " + ex.getMessage());
        }

        try {
            fanficAuthors.add(new Author("George Owrell", "bigbrother@gmail.com", 'M'));
        }
        catch (Exception ex)
        {
            System.out.println("ERR: can't add author to list: " + ex.getMessage());
        }

        try {
            fanficAuthors.add(new Author("Darya Dontsova", "DailyDetective@mail.ru", 'F'));
        }
        catch (Exception ex)
        {
            System.out.println("ERR: can't add author to list: " + ex.getMessage());
        }

        try {
            fanficAuthors.add(new Author("Alan Key", "What is email please help me", 'M'));
        }
        catch (Exception ex)
        {
            System.out.println("ERR: can't add author to list: " + ex.getMessage());
        }

        try {
            fanficAuthors.add(new Author("Bullshit author", "cringe@fuck.it", 'L'));
        }
        catch (Exception ex)
        {
            System.out.println("ERR: can't add author to list: " + ex.getMessage());
        }


        fanficAuthors.forEach(author -> {
            System.out.println(author.toString());
        });

    }
}
