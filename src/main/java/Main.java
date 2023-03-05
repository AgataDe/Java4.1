import com.fasterxml.jackson.databind.ObjectMapper;
import models.Actor;
import models.MovieLibrary;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static helpers.Input.*;
import static helpers.Menu.printMenu;

public class Main {
    public static void main(String[] args) throws IOException {

        MovieLibrary movieLibrary = new ObjectMapper().readValue(new File("src/main/resources/movies.json"),
                MovieLibrary.class);

        Scanner input = new Scanner(System.in);

        while (true) {
            printMenu();
            int userInput = input.nextInt();
            switch (userInput) {
                case 1 -> movieLibrary.getMoviesReleasedBetweenTwoDates(getFirstDate(), getSecondDate());
                case 2 -> movieLibrary.getAllInformationAboutRandomMovie();
                case 3 -> movieLibrary.getMoviesOfSpecificActor(new Actor(getFirstNameofActor(), getLastNameofActor()));
                default -> System.out.println("Please choose one of the below options: ");
            }
        }
    }
}