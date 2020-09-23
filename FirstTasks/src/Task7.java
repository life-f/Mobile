/**
 * @author Bagrova P.A. polya.bagrowa@yandex.ru
 * @brief *Дан массив чисел. Найдите первое уникальное в это массиве число.
 * Например, для массива [1, 2, 3, 1, 2, 4] это число 3.
 */

public class Task7 {
    public static void main(String[] args) {
        int[] array = {12, 5, 12, 7, 10, 10};
        int u;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int buf = array[i];
                    array[i] = array[j];
                    array[j] = buf;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (i + 1 < array.length) {
                if (array[i] != array[i + 1]) {
                    if (i - 1 >= 0) {
                        if (array[i] != array[i - 1]) {
                            System.out.println("Unique " + array[i]);
                        }
                    } else {
                        System.out.println("Unique " + array[i]);

                    }
                }
            }
        }
    }
}
