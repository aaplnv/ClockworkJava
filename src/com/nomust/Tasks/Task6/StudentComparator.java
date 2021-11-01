package com.nomust.Tasks.Task6;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (o1.getGPA() - o2.getGPA());
    }
}
