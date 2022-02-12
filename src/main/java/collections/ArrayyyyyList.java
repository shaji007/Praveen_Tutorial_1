package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayyyyyList {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        integers.add(234);
        integers.add(172936);
        System.out.println(integers);
        integers.remove(0);
        System.out.println(integers);
        integers.add(1, 5);
        System.out.println(integers);
        integers.add(4);
        integers.add(7);
        System.out.println(integers.size());
        System.out.println(integers.get(0));
        Integer[] array = {1,8,4,9};
        List<Integer> integerList = Arrays.asList(array);
        integers.addAll(integerList);
        System.out.println(integers);
        integers.clear();
        System.out.println(integers);
    }
}
