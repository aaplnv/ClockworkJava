// Напишите класс SortingStudentsByGPA который реализует интерфейс
// Comparator таким образом, чтобы сортировать список студентов по их итоговым
// баллам в порядке убывания с использованием алгоритма быстрой сортировки.

package com.nomust.Tasks.Task6;

import com.nomust.Tasks.Task;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task6 extends Task {
    @Override
    public String getName() {
        return "Task 6 (fixed)";
    }

    @Override
    public void Run() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, 100));
        students.add(new Student(2, 15));
        students.add(new Student(3, 80));
        var comparator = new StudentComparator();
       Collections.sort(students, new Comparator<Student>() {
           public int compare(Student o1, Student o2) {
               return comparator.compare(o2, o1);
           }});

       System.out.println("Result:");
        // Исправить эти нелегальные фокусы до защиты
        students.forEach(student -> System.out.println(student.getGPA()));

        pressAnyKey();
    }
}
