/**
 * @author Bagrova P.A. polya.bagrowa@yandex.ru
 * @brief Заполните массив случайным числами и отсортируйте его.
 * Используйте сортировку пузырьком, сортировку выбором или сортировку
 * вставками.
 */

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        float[] array = new float[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (float) Math.random();
        }
        System.out.println(Arrays.toString(array));
        float buf;
        for (int i = 0; i < 10 - 1; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (array[i] > array[j]) {
                    buf = array[i];
                    array[i] = array[j];
                    array[j] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
