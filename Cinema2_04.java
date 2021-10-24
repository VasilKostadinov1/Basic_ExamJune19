package BASIC.Additional_Problems_MIX.ExamPrepJune19;

import java.util.Scanner;

public class Cinema2_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        int counterPeople = 0;
        boolean isFull = false;

        String input = scanner.nextLine();
        while (!input.equals("Movie time!")) {
            int people = Integer.parseInt(input);
            counterPeople += people;
            if (capacity - counterPeople < 0) {  //!!! the check should be in beginning, or 55/100
                isFull = true;
                break;
            }
            sum += people * 5;
            if (people % 3 == 0) {
                sum = sum - 5;
            }
            input = scanner.nextLine();
        }
        if (isFull) {
            System.out.println("The cinema is full.");
        } else {
            System.out.printf("There are %d seats left in the cinema.%n", capacity - counterPeople);
        }
        System.out.printf("Cinema income - %.0f lv.", sum);
    }
}
