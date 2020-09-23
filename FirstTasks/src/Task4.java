/**
 * @author Bagrova P.A. polya.bagrowa@yandex.ru
 * @brief Напишите программу, которая вычислит простые числа в пределах от 2 до 100.
 * Для решения этой задачи понадобится вычислить остаток от деления. В Java для
 * этого есть оператор % (например, 103 % 10 это 3).
 */

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[99];
        for (int i = 2; i <= 100; i++) {
            array[i - 2] += i;
        }
        for (int i = 2; i <= 100; i++) {
            if (simpleNumber(array[i - 2])) {
                System.out.println(array[i - 2]);
            }
        }
    }

    public static boolean simpleNumber(int a) {
        for (int j = 1; j < a / 2 + 1; j++) {
            if (a % j == 0 && j != 1 && j != a) {
                return false;
            }
        }
        return true;
    }
}
