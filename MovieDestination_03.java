package BASIC.Additional_Problems_MIX.ExamPrepJune19;

import java.util.Scanner;

public class MovieDestination_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine(); //"Dubai", "Sofia" и "London"
        String season = scanner.nextLine();     //  "Summer" и "Winter"
        int days = Integer.parseInt(scanner.nextLine());
        double pricePerDay = 0;
        double total = 0;

        switch (season) {
            case "Winter":
                switch (destination) {
                    case "Dubai":
                        pricePerDay = 45000;
                        break;
                    case "Sofia":
                        pricePerDay = 17000;
                        break;
                    case "London":
                        pricePerDay = 24000;
                        break;
                }
                break;
            case "Summer":
                switch (destination) {
                    case "Dubai":
                        pricePerDay = 40000;
                        break;
                    case "Sofia":
                        pricePerDay = 12500;
                        break;
                    case "London":
                        pricePerDay = 20250;
                        break;
                }
                break;
        }
        total = pricePerDay * days;
        if (destination.equals("Dubai")) {
            total = total * 0.70;
        } else if (destination.equals("Sofia")) {
            total = total * 1.25;
        }
        if (budget>=total){
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!" ,Math.abs(budget-total));
        }else {
            System.out.printf("The director needs %.2f leva more!",Math.abs(budget-total));
        }


    }
}
