package movieTheater;

import com.github.javafaker.Faker;

import java.util.Arrays;

public class Ipic extends Theater implements MovieService {

    private String dinner;
    private Faker faker;
    String[]movies;
    public Ipic(int numberOfSeats, boolean hasPopcorn, int numberOfRooms, int numberOfRestrooms, boolean has3D, boolean hasDrinks, String dinner) {
        super(numberOfSeats, hasPopcorn, numberOfRooms, numberOfRestrooms, has3D, hasDrinks);
        this.dinner = dinner;
        faker=new Faker();
        movies=new String[5];
        for (int i = 0; i <5 ; i++) {
            movies[i]=faker.book().title();
        }
    }

    public String getDinner() {
        return dinner;
    }

    public void setDinner(String dinner) {
        this.dinner = dinner;
    }

    @Override
    public void welcomeCustomers() {
        System.out.println("Welcome to Ipic movie service");

    }

    @Override
    public void showAvailableMovies() {
        System.out.println("------AVAILABLE MOVIES-------");
        System.out.println("MOVIE NAME                    PRICE");
        for (int i = 0; i < movies.length; i++) {
            System.out.println((i+1) + ". " + movies[i] + "             $" +  Double.valueOf((int)(Math.random()*(20-8)+8)) );
        }
        System.out.println();
    }

    @Override
    public void showAvailableSeat(String movie) {
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].equalsIgnoreCase(movie)){
                System.out.println("AVAILABLE SEATS FOR " + movies[i] + ": " + (int)(Math.random()*(30-10)+10));
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
        return "Ipic info" +
                "dinner " + dinner + "\n" +
                "NUMBER OF SEATS: " + getNumberOfSeats() + "\n" +
                "POP CORN: " + isHasPopcorn() + "\n" +
                "NUMBER OF ROOMS: " + getNumberOfRooms() +"\n" +
                "NUMBER OF RESTROOMS: " + getNumberOfRestrooms() +"\n" +
                "3D AVAILABLE: " + isHas3D() +"\n" +
                "DRINKS: " + isHasDrinks() +"\n" ;

    }
}
