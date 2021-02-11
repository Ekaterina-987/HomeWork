package home_work_5.comparators;

import home_work_5.dto.Student;

import java.util.Comparator;

public class StudentScoreComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (o1.compareTo(o2));
    }

//    @Override
//    public int compare(Student o1, Student o2) {
//        return o1.compareTo(o2);   //компаратор, который переиспользует compareTo
//    }
}
