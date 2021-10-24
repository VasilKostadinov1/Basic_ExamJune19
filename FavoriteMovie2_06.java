package BASIC.Additional_Problems_MIX.ExamPrepJune19;

import java.util.Scanner;

public class FavoriteMovie2_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int counter = 0;

        int max = Integer.MIN_VALUE;
        String bestMovie = "";

        while (!name.equals("STOP")) {
            int sum = 0;   // declare it inside the while, as it should be zero after each film!!!
            counter++;
            if (counter == 7) {
                System.out.println("The limit is reached.");
                break;
            }
            for (int i = 0; i < name.length(); i++) {  // Iterate over each word in a Film
                char symbol = name.charAt(i);
                if (symbol >= 65 && symbol <= 90) {
                    sum += (symbol - name.length());
                } else if (symbol >= 97 && symbol <= 122) {
                    sum += (symbol - (2 * name.length()));
                } else {
                    sum += symbol;
                }
            }
            if (sum > max) {
                max = sum;
                bestMovie = name;
            }
            name = scanner.nextLine();
        }
        System.out.printf("The best movie for you is %s with %d ASCII sum.", bestMovie, max);
    }
}
