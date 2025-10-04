
package ticket_booking;

import ticket_booking.services.UserBookingService;

import java.io.IOException;
import java.util.stream.Collectors;
import java.util.*;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        System.out.println("Running Train Booking System ");

        Scanner scanner = new Scanner(System.in);
        int option = 0;
        UserBookingService userBookingService;

        try{
            userBookingService = new UserBookingService();
        } catch (IOException ex) {
            System.out.println("There is something wrong");
            return ;
        }


        while (option!=7){


        }


    }
}
