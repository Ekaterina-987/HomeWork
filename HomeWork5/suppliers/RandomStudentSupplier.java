package home_work_5.suppliers;

import home_work_5.core.GlobalCounter;
import home_work_5.dto.Student;
import home_work_5.utils.FakeRandom;
import home_work_5.utils.Java8Random;
import home_work_5.utils.api.IRandom;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

public class RandomStudentSupplier implements Supplier<Student> {

    private final Java8Random rnd;
    private GlobalCounter counter;

    public RandomStudentSupplier(GlobalCounter counter, Java8Random rnd) {
        this.rnd = rnd;
        this.counter = counter;
    }

//    public RandomStudentSupplier() {
//        this.rnd = new FakeRandom();
//    }

    @Override
    public Student get() {
        return new Student(
                counter.getAndInc(),
                rnd.randString(3, 10),
                rnd.randInt(7, 17),
                rnd.randDouble(0, 10),
                rnd.randBoolean()
        );
    }
}
