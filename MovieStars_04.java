package BASIC.Additional_Problems_MIX.ExamPrepJune19;

import java.util.Scanner;

public class MovieStars_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String name = scanner.nextLine();
                  //След това се четат многократно по !!един или два реда!! до команда "ACTION" или до изчерпване на бюджета
        while (!name.equals("ACTION")) {
            if (name.length() > 0 && name.length() <= 15) {
                double salary = Double.parseDouble(scanner.nextLine());  // !!! scanner.nextLine
                budget -= salary;
            } else {        //Ако името на актьора е по-дълго от 15 символа възнаграждението му ще е 20 % от останалия бюджет до момента
                budget = budget * 0.80;
            }
            if (budget <= 0) {         //Ако бюджета в даден момент свърши, програмата трябва да прекъсне.
                break;
            }
            name = scanner.nextLine();
        }
        if (budget >= 0) {
            System.out.printf("We are left with %.2f leva.", Math.abs(budget));
        } else {
            System.out.printf("We need %.2f leva for our actors.", Math.abs(budget));
        }

    }
}
