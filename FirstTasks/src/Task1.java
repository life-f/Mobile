/**
 * @author Bagrova P.A. polya.bagrowa@yandex.ru
 * @brief Заполните массив случайным числами и выведете максимальное,
 * минимальное и среднее значение.
 * Для генерации случайного числа используйте метод Math.random(), который
 * возвращает значение в промежутке [0, 1].
 */

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        float[] array = new float[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (float) Math.random();
        }
        System.out.println(Arrays.toString(array));
        float max, min, avg;
        max = min = avg = array[0];
        for (int i = 1; i < 10; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
            avg += array[i];
        }
        avg = avg / 10;
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Average: " + avg);
    }
}
