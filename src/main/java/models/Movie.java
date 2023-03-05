package models;

import java.util.List;

public class Movie {
    private String title;
    private int date;
    private Director director;
    private String genre;
    private List<Actor> actors;

    public Movie(String title, int date, Director director, String genre, List<Actor> actors) {
        this.title = title;
        this.date = date;
        this.director = director;
        this.genre = genre;
        this.actors = actors;
    }

    public Movie() {
    }

    public String getTitle() {
        return title;
    }

    public int getDate() {
        return date;
    }

    public Director getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public List<Actor> getActors() {
        return actors;
    }

    private String getActorsListToString(List<Actor> actors) {
        String actorsListToString = this.actors.toString();
        return actorsListToString.substring(1, actorsListToString.length() - 1);
    }

    @Override
    public String toString() {
        return "title: " + this.getTitle()
                + "\n" + "director: " + this.getDirector()
                + "\n" + "genre: " + this.getGenre()
                + "\n" + "date: " + this.getDate()
                + "\n" + "actors: " + getActorsListToString(actors);
    }
}
