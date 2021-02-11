package home_work_5.predicate;

import home_work_5.dto.Student;

import java.util.function.Predicate;

 public class StudentsAgeAndScorePredicate implements Predicate<Student> {
    private final int age;
    private final int score;

    public StudentsAgeAndScorePredicate(int age, int score) {
        this.age = age;
        this.score = score;
    }

    @Override
    public boolean test(Student student) {
        return student.getAge() >= age && student.getScore() > score;
    }
}
