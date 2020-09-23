/**
 * @author Bagrova P.A. polya.bagrowa@yandex.ru
 * @brief Вычислить N-е число Фибоначчи.
 */

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.print("Enter a number of element: ");
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int prev = 0;
        int next = 1;
        for (int i = 3; i <= N; i++) {
            int buf = prev;
            prev = next;
            next += buf;
        }
        System.out.println(next);
    }
}
