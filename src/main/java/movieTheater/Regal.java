package movieTheater;

import com.github.javafaker.Faker;

import java.util.Arrays;

public class Regal extends Theater implements MovieService{

    private String secondFloor;
    private Faker faker;
    String[]movies;
    public Regal(int numberOfSeats, boolean hasPopcorn, int numberOfRooms, int numberOfRestrooms, boolean has3D, boolean hasDrinks, String secondFloor) {
        super(numberOfSeats, hasPopcorn, numberOfRooms, numberOfRestrooms, has3D, hasDrinks);
        this.secondFloor = secondFloor;
        faker=new Faker();
        movies=new String[15];
        for (int i = 0; i < 15; i++) {
            movies[i] = faker.book().title();
        }
    }

    public String getSecondFloor() {
        return secondFloor;
    }

    public void setSecondFloor(String secondFloor) {
        this.secondFloor = secondFloor;
    }

    @Override
    public void welcomeCustomers() {
        System.out.println("Welcome to Regal and enjoy ");
    }

    @Override
    public void showAvailableMovies() {
        System.out.println("------AVAILABLE MOVIES-------");
        System.out.println("MOVIE NAME                    PRICE");
        for (int i = 0; i < movies.length; i++) {
            System.out.println((i+1) + ". " + movies[i] + "             $" +  Double.valueOf((int)(Math.random()*(15-8)+8)) );
        }
        System.out.println();



    }

    @Override
    public void showAvailableSeat(String movie) {
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].equalsIgnoreCase(movie)){
                System.out.println("AVAILABLE SEATS FOR " + movies[i] + ": " + (int)(Math.random()*(95-45)+45));
                return;
            }

        }

    }

    @Override
    public void showTheaterInfo() {
        System.out.println(
                this
        );

    }

    @Override
    public String toString() {
        return "Ragal info:\n" +
                "Location is : " + secondFloor + "\n" +
                "NUMBER OF SEATS: " + getNumberOfSeats() + "\n" +
                "POP CORN: " + isHasPopcorn() + "\n" +
                "NUMBER OF ROOMS: " + getNumberOfRooms() +"\n" +
                "NUMBER OF RESTROOMS: " + getNumberOfRestrooms() +"\n" +
                "3D AVAILABLE: " + isHas3D() +"\n" +
                "DRINKS: " + isHasDrinks() +"\n" ;
    }
}
