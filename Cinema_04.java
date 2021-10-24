package BASIC.Additional_Problems_MIX.ExamPrepJune19;

import java.util.Scanner;

public class Cinema_04 {
    public static void main(String[] args) {            // 100/100
        Scanner scanner = new Scanner(System.in);
        int capacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        boolean isFull = false;
        int sum = 0;

        while (!input.equals("Movie time!")) {
            int peopleCount = Integer.parseInt(input);
            capacity -= peopleCount;
            if (capacity < 0) {          //!!! the check should be in beginning, or 55/100
                isFull = true;
                break;
            }
            int profit = peopleCount * 5;
            if (peopleCount % 3 == 0) {
                profit = profit - 5;
            }
            sum += profit;

            input = scanner.nextLine();
        }
        if (isFull) {
            System.out.println("The cinema is full.");
        } else {
            System.out.printf("There are %d seats left in the cinema.%n", capacity);
        }
        System.out.printf("Cinema income - %d lv.", sum);


    }
}
