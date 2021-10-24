package BASIC.Additional_Problems_MIX.ExamPrepJune19;

import java.util.Scanner;

public class FavoriteMovie_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();     // my solution 100/100
        int max=Integer.MIN_VALUE;
        String bestFilm= "";
        int count=0;
        boolean isMaxReached=false;

        while (!movie.equals("STOP")) {
            count++;
            int sum = 0;
            for (int i = 0; i < movie.length(); i++) {  // Iterate over each word in a Film
                char symbol = movie.charAt(i);
                sum+=symbol;                            // Точките - сбор от ASCII стойностите на символите в заглавието на филма
                if (symbol >= 65 && symbol <= 90) {      //	За всяка главна буква в заглавието, от сумата трябва да се извади дължината
                    sum -= movie.length();
                } else if (symbol >= 97 && symbol <= 122) {    //За всяка малка буква в заглавието, от сумата трябва да се извади два пъти дължината
                    sum -= 2 * movie.length();
                }
            }
            if (sum>max){
                max=sum;
                bestFilm=movie;
            }
            if (count==7){
                isMaxReached=true;
                break;
            }
            movie = scanner.nextLine();
        }
        if (isMaxReached){
            System.out.println("The limit is reached.");
        }
        System.out.printf("The best movie for you is %s with %d ASCII sum.",bestFilm,max);

    }
}
