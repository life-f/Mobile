/**
 * @author Bagrova P.A. polya.bagrowa@yandex.ru
 * @brief *Дан массив и число K. Найдите первые K самых
 * часто встречающихся элементов.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        HashMap<Integer, Integer> quant = new HashMap<>();
        for (int j : array) {
            if (quant.containsKey(j)) {
                int buf = quant.get(j);
                buf++;
                quant.put(j, buf);
            } else {
                quant.put(j, 1);
            }
        }
        System.out.println(quant.toString());
        System.out.print("Enter K: ");
        Scanner in = new Scanner(System.in);
        int K = in.nextInt();
        int it = 0;
        int key = -1;
        while (it != K) {
            int max = -1;
            for (Integer i : quant.keySet()) {
                if (quant.get(i) > max) {
                    max = quant.get(i);
                    key = i;
                }
            }
            System.out.println(key);
            quant.remove(key);
            it++;
        }
    }
}
