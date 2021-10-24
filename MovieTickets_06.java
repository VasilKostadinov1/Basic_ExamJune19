package BASIC.Additional_Problems_MIX.ExamPrepJune19;

import java.util.Scanner;

public class MovieTickets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a1 = Integer.parseInt(scanner.nextLine());
        int a2 = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = a1; i <= a2 - 1; i++) {                      //•	Символ 1: символ с ASCII код от а1 до а2 - 1
            for (int j = 1; j <= n - 1; j++) {                   //•	Символ 2: цифра от 1 до n - 1
                for (int k = 1; k <= (n / 2 - 1); k++) {         // •	Символ 3: цифра от 1 до n / 2 - 1
                    if (i % 2 == 1 && (j + k + i) % 2 == 1) {    //символ 1 е нечетна и сборът на символ 2, символ 3 и символ 4 е нечетен.
                        System.out.printf("%c-%d%d%d%n", i, j, k, i);    // W-1187 , W-3187

                    }       // !!! %c - prints the char symbol

                }

            }
        }
    }
}
