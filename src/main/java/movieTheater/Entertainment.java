package movieTheater;

import java.util.Locale;
import java.util.Scanner;

public class Entertainment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO MOVIE WORLD! PLEASE CHOOSE YOUR FAVORITE THEATER");
        System.out.println("AMC | REGAL | EMAGINE | IPIC");
        String theater = scanner.nextLine().toUpperCase(Locale.ROOT);

        MovieService service = null;
        switch (theater){
            case "AMC":
                service = new Amc(100, true, 5, 2, true, true, true);
               service.welcomeCustomers();

               while (true){
                   System.out.println("movies | seats | info | quit");
                   String option = scanner.nextLine();
                   if (option.equalsIgnoreCase("movies")){
                       service.showAvailableMovies();
                   }
                   else if (option.equalsIgnoreCase("seats")){
                       System.out.print("WHICH MOVIE? ");
                       String movieName = scanner.nextLine();
                       service.showAvailableSeat(movieName);
                   } else if (option.equalsIgnoreCase("info")) {
                       service.showTheaterInfo();
                   } else if (option.equalsIgnoreCase("quit")) {
                       System.out.println("HAVE A NICE DAY!!!");
                       break;
                   }else{
                       System.out.println("INVALID VALUE. TRY AGAIN");
                   }
               }
               break;
            case "REGAL":
                service = new Regal(145, true, 4, 1, true, true, "Second Floor");
                service.welcomeCustomers();

                while (true){
                    System.out.println("movies | seats | info | quit");
                    String option = scanner.nextLine();
                    if (option.equalsIgnoreCase("movies")){
                        service.showAvailableMovies();
                    } else if (option.equalsIgnoreCase("seats")){
                        System.out.print("Which movie ? ");
                        String movieName = scanner.nextLine();
                        service.showAvailableSeat(movieName);
                    } else if (option.equalsIgnoreCase("info")) {
                        service.showTheaterInfo();
                    } else if (option.equalsIgnoreCase("quit")) {
                        System.out.println("HAVE A NICE DAY!!!");
                        break;
                    }else{
                        System.out.println("INVALID VALUE. TRY AGAIN");
                    }
                }
                break;
            case "EMAGINE":
                service=new Emagine(50,false,4,3,true,true,"Birthdays");
                service.welcomeCustomers();
                while (true){
                    System.out.println("movies | seats | info | quit");
                    String option = scanner.nextLine();
                    if (option.equalsIgnoreCase("movies")){
                        service.showAvailableMovies();
                    } else if (option.equalsIgnoreCase("seats")){
                        System.out.print("Which movie ? ");
                        String movieName = scanner.nextLine();
                        service.showAvailableSeat(movieName);
                    } else if (option.equalsIgnoreCase("info")) {
                        service.showTheaterInfo();
                    } else if (option.equalsIgnoreCase("quit")) {
                        System.out.println("HAVE A NICE DAY!!!");
                        break;
                    }else{
                        System.out.println("INVALID VALUE. TRY AGAIN");
                    }
                }

                break;
            case "IPIC":
                service=new Ipic(30,true,2,1,true,true,"Burgers with french fries");
                service.welcomeCustomers();
                while (true){
                    System.out.println("movies | seats | info | quit");
                    String option = scanner.nextLine();
                    if (option.equalsIgnoreCase("movies")){
                        service.showAvailableMovies();
                    } else if (option.equalsIgnoreCase("seats")){
                        System.out.print("Which movie ? ");
                        String movieName = scanner.nextLine();
                        service.showAvailableSeat(movieName);
                    } else if (option.equalsIgnoreCase("info")) {
                        service.showTheaterInfo();
                    } else if (option.equalsIgnoreCase("quit")) {
                        System.out.println("HAVE A NICE DAY!!!!");
                        break;
                    }else{
                        System.out.println("INVALID VALUE. TRY AGAIN");
                    }
                }

                break;
        }



    }
}
