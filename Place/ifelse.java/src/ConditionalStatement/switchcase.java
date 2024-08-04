package ConditionalStatement;

import java.util.Scanner;

public class switchcase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day");

        int day = sc.nextInt();

        switch (day){
            case 1:
                System.out.println("TODAY IS SUNDAY");
            break;
            case 2:
                System.out.println("TODAY IS MONDAY");
            break;
            case 3:
                System.out.println("TODAY IS THUSEDAY");
            break;
            default:
                System.out.println("nothig today");
        }


    }
}

