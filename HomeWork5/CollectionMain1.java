package home_work_5;


import home_work_5.comparators.StudentAgeAndScoreComparator;
import home_work_5.comparators.StudentNameComparator;
import home_work_5.comparators.StudentScoreComparator;
import home_work_5.core.GlobalCounter;
import home_work_5.dto.Student;
import home_work_5.predicate.StudentsAgeAndScorePredicate;
import home_work_5.suppliers.RandomStudentSupplier;
import home_work_5.utils.FakeRandom;
import home_work_5.utils.Java7Random;
import home_work_5.utils.Java8Random;
import home_work_5.utils.SortUtils;
import home_work_5.utils.api.IRandom;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class CollectionMain1 {

    public static void main(String[] args) {
        Supplier<Student> supplier = new RandomStudentSupplier(new GlobalCounter(), new Java8Random());
        Predicate<Student> predicate = new StudentsAgeAndScorePredicate(12, 8);

        int top_ten = 10;
        IRandom rnd = new Java8Random();

        List<Student> data = new ArrayList<>();

        do{
            data.add(supplier.get());
        }while (data.size() < 10000);

        //System.out.println(data);

        List<Student> filteredStudent = new ArrayList<>();

        for (Student value : data) {
            if (predicate.test(value)) {
                filteredStudent.add(value);

            }
        }

        /**
         * 4. Отсортировать отфильтрованных студентов по имени, от меньшему к большему. Вывести топ 10
         */

        StudentNameComparator comparator = new StudentNameComparator();
        SortUtils.bubbleSort(filteredStudent, comparator.reversed());
        System.out.println(filteredStudent.subList(0, 10));

        System.out.println(" ");

        /**
         * 5. Отсортировать отфильтрованных студентов по оценке, от большего к меньшему. Вывести топ 10
         */

        StudentScoreComparator comparator1 = new StudentScoreComparator();
        SortUtils.shakerSort(filteredStudent, comparator1);
        System.out.println(filteredStudent.subList(0, 10));

        System.out.println(" ");

        /**
         * 6. Отсортировать отфильтрованных студентов по возрасту и оценке одновременно. Вывести топ 10 в каждом возрасте.
         */

        StudentAgeAndScoreComparator comparator2 = new StudentAgeAndScoreComparator();
        SortUtils.bubbleSort(filteredStudent, comparator2);
        System.out.println(filteredStudent);


    }

}


