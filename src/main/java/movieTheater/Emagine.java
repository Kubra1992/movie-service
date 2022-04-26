package movieTheater;

import com.github.javafaker.Faker;

import java.util.Arrays;

public class Emagine extends Theater implements MovieService{

    private String specialEvent;
    private Faker faker;
    private String[]movies;
    public Emagine(int numberOfSeats, boolean hasPopcorn, int numberOfRooms, int numberOfRestrooms, boolean has3D, boolean hasDrinks, String specialEvent) {
        super(numberOfSeats, hasPopcorn, numberOfRooms, numberOfRestrooms, has3D, hasDrinks);
        this.specialEvent = specialEvent;
        faker=new Faker();
        movies=new String[15];
        for (int i = 0; i < 15; i++) {
            movies[i] = faker.book().title();
        }

    }

    public String getSpecialEvent() {
        return specialEvent;
    }

    public void setSpecialEvent(String specialEvent) {
        this.specialEvent = specialEvent;
    }

    @Override
    public void welcomeCustomers() {
        System.out.println("Welcome to Emagine ! Hope you have a great time with us");

    }

    @Override
    public void showAvailableMovies() {
        System.out.println("------AVAILABLE MOVIES-------");
        System.out.println("MOVIE NAME                    PRICE");
        for (int i = 0; i < movies.length; i++) {
            System.out.println((i+1) + ". " + movies[i] + "             $" +  Double.valueOf((int)(Math.random()*(25-10)+10)) );
        }
        System.out.println();

    }

    @Override
    public void showAvailableSeat(String movie) {
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].equalsIgnoreCase(movie)){
                System.out.println("AVAILABLE SEATS FOR " + movies[i] + ": " + (int)(Math.random()*(120-20)+20));
                return;
            }

        }

    }

    @Override
    public void showTheaterInfo() {
        System.out.println(this);

    }

    @Override
    public String toString() {
        return "Emagine  info:\n" +
                "Special event : " + specialEvent + "\n" +
                "NUMBER OF SEATS: " + getNumberOfSeats() + "\n" +
                "POP CORN: " + isHasPopcorn() + "\n" +
                "NUMBER OF ROOMS: " + getNumberOfRooms() +"\n" +
                "NUMBER OF RESTROOMS: " + getNumberOfRestrooms() +"\n" +
                "3D AVAILABLE: " + isHas3D() +"\n" +
                "DRINKS: " + isHasDrinks() +"\n" ;
    }
}
