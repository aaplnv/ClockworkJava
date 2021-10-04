package com.nomust.Tasks.Task2;

public class Author {
    public Author(String name, String email, char gender) throws Exception {
        if (gender != 'M' && gender != 'F' && gender != 'W') throw new Exception("Gender is now allowed");
        if (!email.contains("@")) throw new Exception("Invalid email");
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return "My name is " + this.name + "\n" + "Gender: " + this.gender+  "\n" + "Email: " + this.email + "\n";
    }

    private String name;
    private String email;
    private char gender;



}
