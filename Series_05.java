package BASIC.Additional_Problems_MIX.ExamPrepJune19;

import java.util.Scanner;

public class Series_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int count = Integer.parseInt(scanner.nextLine());
        double sum = 0;

        for (int i = 1; i <= count; i++) {
            String name = scanner.nextLine();
            double price = Double.parseDouble(scanner.nextLine());

            switch (name) {
                case "Thrones":
                    price = price * 0.50;
                    break;
                case "Lucifer":
                    price = price * 0.60;
                    break;
                case "Protector":
                    price = price * 0.70;
                    break;
                case "TotalDrama":
                    price = price * 0.80;
                    break;
                case "Area":
                    price = price * 0.90;
                    break;
                default:
                    break;
            }
            sum += price;
        }
        if (budget >= sum) {
            System.out.printf("You bought all the series and left with %.2f lv.%n", Math.abs(budget - sum));
        } else {
            System.out.printf("You need %.2f lv. more to buy the series!", Math.abs(budget - sum));
        }
    }
}
