
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import static java.util.Arrays.copyOf;

public class ArrayTest {
    public static void main(String[] args) {
        Array arr_1 = new ArrayImpl(100000);

        addValues(arr_1);
    }

    private static void addValues(Array arr_1) {
        int a = 0; // нижняя граница для случайных чисел
        int b = arr_1.getMaxSize(); // верхняя граница для случайных чисел

        for (int i = 0; i < arr_1.getMaxSize(); i++) {
            arr_1.add(a + (int) (Math.random() * b));
        }

        Array arr_2 = new ArrayImpl(arr_1.getMaxSize());
        Array arr_3 = new ArrayImpl(arr_1.getMaxSize());

        arr_2.setData(arr_1.getData());
        arr_3.setData(arr_1.getData());

        System.out.println("Время работы пузырька: ");
        long start1 = System.nanoTime();
        SortingClass.sortBubble(arr_1.getData());
        System.out.println(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - start1));

        System.out.println("Время работы выбора: ");
        long start2 = System.nanoTime();
        SortingClass.sortSelect(arr_2.getData());
        System.out.println(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - start2));

        System.out.println("Время работы вставки: ");
        long start3 = System.nanoTime();
        SortingClass.sortInsert(arr_3.getData());
        System.out.println(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - start3));
    }
}