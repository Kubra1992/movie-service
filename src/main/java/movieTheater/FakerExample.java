package movieTheater;

import com.github.javafaker.Faker;

public class FakerExample {

    public static void main(String[] args) {

        Faker faker = new Faker();

        String title = faker.book().title();
        System.out.println(title);


    }
}
