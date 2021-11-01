// Напишите класс SortingStudentsByGPA который реализует интерфейс
// Comparator таким образом, чтобы сортировать список студентов по их итоговым
// баллам в порядке убывания с использованием алгоритма быстрой сортировки.

package com.nomust.Tasks.Task6;

import com.nomust.Tasks.Task;

public class Task6 extends Task {
    @Override
    public String getName() {
        return "Task6 (new)";
    }

    @Override
    public void Run() {
        var poluyanov = new Student(1, 100);
        var frolov = new Student(2, 100);
        var ivanov = new Student(3, 15);

        var comparator = new StudentComparator();
        System.out.println(comparator.compare(frolov, ivanov));
    }
}
