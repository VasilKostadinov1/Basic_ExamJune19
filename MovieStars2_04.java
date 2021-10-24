package BASIC.Additional_Problems_MIX.ExamPrepJune19;

import java.util.Scanner;

public class MovieStars2_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        boolean isLeft = false;
        double money2=0;   // declare new variable for the 2nd case ">=15 symbols"

        String name = scanner.nextLine();
        while (!name.equals("ACTION")) {   //се четат многократно по !!един или два реда!! до команда "ACTION"

            if (name.length() <= 15) {
                double money = Double.parseDouble(scanner.nextLine());
                budget-=money;
            } else {   // >15
                money2 = budget * 0.20;
                budget-=money2;
            }
            if (budget < 0) {
                isLeft = true;
                break;
            }
            name = scanner.nextLine();
        }
        if (isLeft) {
            System.out.printf("We need %.2f leva for our actors.", Math.abs(budget));
        } else {
            System.out.printf("We are left with %.2f leva.",Math.abs(budget));
        }
    }
}
