package com.nomust.Tasks.Task6;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student first, Student second) {
        return (first.getGPA() - second.getGPA());
    }
}
