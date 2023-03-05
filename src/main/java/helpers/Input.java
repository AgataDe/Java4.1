package helpers;

import java.util.Scanner;

public class Input {

    private static Scanner input = new Scanner(System.in);

    public static int getFirstDate() {
        System.out.println("Please enter first date");
        return input.nextInt();
    }

    public static int getSecondDate() {
        System.out.println("Please enter second date");
        return input.nextInt();
    }

    public static String getFirstNameofActor() {
        input.nextLine();
        System.out.println("Please enter first name of the actor");
        return input.nextLine();
    }

    public static String getLastNameofActor() {
        System.out.println("Please enter last name of the actor");
        return input.nextLine();
    }


}
