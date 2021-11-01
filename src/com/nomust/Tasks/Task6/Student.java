package com.nomust.Tasks.Task6;

public class Student implements Comparable<Student> {

    private int id;
    private int GPA;

    public Student(int id, int GPA) {
        this.id = id;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idNum=" + id +
                ", GPA=" + GPA +
                '}';
    }

    public int getGPA() {
        return GPA;
    }

    @Override
    public int compareTo(Student student) {
        return this.id - student.id;
    }
}
