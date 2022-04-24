package movieTheater;

public class Regal extends Theater implements MovieService{

    private String secondFloor;
    public Regal(int numberOfSeats, boolean hasPopcorn, int numberOfRooms, int numberOfRestrooms, boolean has3D, boolean hasDrinks, String secondFloor) {
        super(numberOfSeats, hasPopcorn, numberOfRooms, numberOfRestrooms, has3D, hasDrinks);
        this.secondFloor = secondFloor;
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


    }

    @Override
    public void showAvailableSeat(String movie) {

    }

    @Override
    public void showTheaterInfo() {

    }
}
