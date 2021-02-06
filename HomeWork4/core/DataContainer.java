package home_work_4.core;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T> {
    private T[] data;

    public DataContainer(T[] data) {
        this.data = data;
    }


    public int add(T item){
        if (item != null){
            for(int i = 0; i < data.length; i++){
                if (data[i] == null){
                    data[i] = item;
                    return i;
                } else if (i == data.length - 1){
                    data = Arrays.copyOf(data, data.length + 1);
                    i++;
                    data[i] = item;
                } else {

                }
            }
        }
        return 1;
    }

    public T get (int index){
        if(index < 0){
            return null;
        }else if(index > data.length){
            return null;
        }else{
            return data[index];
        }
    }

    public T[] getItems(){
        return data;
    }

    public boolean delete (int index){
        if(index <= data.length){
            return true;
        }else if(index > data.length){
            return false;
        }
        else {
        }
        return false;
    }

    public boolean delete (T item) {
        for (int i = 0; i < data.length; i++){
            if (data[i] == item){
                for(int j = i; j < data.length - 1; j++){
                    data[j] = data[j + 1];
                    data = Arrays.copyOf(data, data.length - 1);
                }
                return true;
            }else if(data[i] != item){
                return  false;
            }else{

            }
        }
        return false;
    }
    public void sort (Comparator<T> comparator){
        for (int j = 1; j < data.length - 1; j++) {
            boolean flagEnd = true;
            for (int i = 0; i < data.length - j; i++) {
                int compare = comparator.compare(data[i], data[i + 1]);
                if (compare > 0) {
                    T buffer = data[i];
                    data[i] = data[i + 1];
                    data[i + j] = buffer;
                    flagEnd = false;
                }
            }
            if (flagEnd) {
                break;
            }
        }
    }
    public String toString(){
        return Arrays.toString(data);
    }
}

