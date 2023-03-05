package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MovieLibrary {
    private List<Movie> movies;

    public MovieLibrary() {
    }

    public MovieLibrary(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void getMoviesReleasedBetweenTwoDates(int firstDate, int secondDate) {
        for (Movie exampleMovie : movies) {
            if (exampleMovie.getDate() >= firstDate && exampleMovie.getDate() <= secondDate) {
                System.out.println(exampleMovie.getTitle());
            }
        }
    }

    public void getAllInformationAboutRandomMovie() {
        Random random = new Random();
        System.out.println(movies.get(random.nextInt(movies.size())).toString());
    }

    public void getMoviesOfSpecificActor(Actor actor) {
        List<String> ListOfMoviesOfSpecificActor = new ArrayList<>();
        for (Movie exampleofTheMovie : movies) {
            List<Actor> listOfMovieActors = exampleofTheMovie.getActors();
            for (Actor theActor : listOfMovieActors) {
                if (theActor.getFirstName().equals(actor.getFirstName()) && theActor.getLastName()
                        .equals(actor.getLastName())) {
                    ListOfMoviesOfSpecificActor.add(exampleofTheMovie.getTitle());
                }
            }
        }

        String moviesOfSpecificActor = ListOfMoviesOfSpecificActor.toString();
        System.out.println(moviesOfSpecificActor.substring(1, moviesOfSpecificActor.length() - 1));
    }
}
