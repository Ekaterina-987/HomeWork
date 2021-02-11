package home_work_5.utils;

import home_work_5.utils.api.IRandom;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

//https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
public class Java8Random implements IRandom{
    @Override
    public double randDouble(double min, double max) {
        return ThreadLocalRandom.current().nextDouble(min, max);
    }

    @Override
    public String randString(int min, int max) {
        String name = "абвгдежзийклмнопрстуфхцчшщьыъэюя";
        StringBuilder sb = new StringBuilder();
        for (int i =0; i < randInt(min, max); i++) {
            sb.append(name.charAt(randInt(min, max + 1)));
        }
        return sb.toString();
    }

    @Override
    public boolean randBoolean() {
        return ThreadLocalRandom.current().nextBoolean();
    }

    public int randInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}
