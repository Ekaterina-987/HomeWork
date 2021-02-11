package home_work_5.comparators;

import home_work_5.dto.Student;

import java.util.Comparator;

public class StudentAgeAndScoreComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
