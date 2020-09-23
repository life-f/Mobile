/**
 * @author Bagrova P.A. polya.bagrowa@yandex.ru
 * @brief *Дан массив чисел и число. Удалите все вхождения числа
 * в массив (пропусков быть не должно).
 */

import java.util.ArrayList;
import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        int N = 10;
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            array.add(random.nextInt(4));
        }
        System.out.println(array.toString());
        int exep = 3;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) == exep) {
                array.remove(i);
            }
        }
        System.out.println(array.toString());
    }
}
