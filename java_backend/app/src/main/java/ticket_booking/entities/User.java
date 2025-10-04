package ticket_booking.entities;

import ticket_booking.entities.Ticket;
import java.util.List;

public class User {
   private String name;
   private String password;
   private String hashPasswordString;

   private List<Ticket> ticketsBooked;

   private String userId;


   public User(String name, String password, String hashPasswordString, List<Ticket> ticketsBooked, String userId) {
      this.name = name;
      this.password = password;
      this.hashPasswordString = hashPasswordString;
      this.ticketsBooked = ticketsBooked;
      this.userId = userId;


   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getHashPasswordString() {
      return hashPasswordString;
   }

   public void setHashPasswordString(String hashPasswordString) {
      this.hashPasswordString = hashPasswordString;
   }



   public List<Ticket> getTicketsBooked() {
      return ticketsBooked;
   }

   public void setTicketsBooked(List<Ticket> ticketsBooked) {
      this.ticketsBooked = ticketsBooked;
   }

   public String getUserId() {
      return userId;
   }

   public void setUserId(String userId) {
      this.userId = userId;
   }


}
