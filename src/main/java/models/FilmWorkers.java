package models;

public class FilmWorkers {

    private String firstName;
    private String lastName;

    public FilmWorkers(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public FilmWorkers() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return this.firstName + ' ' + this.lastName;
    }
}
