/**
 * @author Bagrova P.A. polya.bagrowa@yandex.ru
 * @brief Найти алгебраическую сумму для выражения:
 * 1^k + 2^k + 3^k + ... + N^k.
 * N и степень k вводит пользователь.
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 number: quantity and degree: ");
        int N = scanner.nextInt();
        int k = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += Math.pow(i, k);
        }
        System.out.println(sum);
    }
}
