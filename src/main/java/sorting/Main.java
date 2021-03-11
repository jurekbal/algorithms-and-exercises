package sorting;

import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        final int[] unsortedArray = {7, 3 ,56, -98, 0, 3, 43, 12, 3, 1};

        Reflections reflections  = new Reflections("sorting");
        Set<Class<? extends Sort>> sortImplementations = reflections.getSubTypesOf(Sort.class);

        System.out.println("Number of sort interface implementations found: " + sortImplementations.size());

        for (Class<? extends Sort> sortImplementation : sortImplementations) {
            try {
                Sort sort = sortImplementation.getConstructor().newInstance();
                int[] myArray = Arrays.copyOf(unsortedArray, unsortedArray.length);
                System.out.println("Using implementation: " + sort.getClass().getSimpleName());
                System.out.println(Arrays.toString(myArray));
                sort.sortAsc(myArray);
                System.out.println(Arrays.toString(myArray));
            } catch (InstantiationException | InvocationTargetException | NoSuchMethodException | IllegalAccessException e) {
                e.printStackTrace();
            }

        }


    }
}
