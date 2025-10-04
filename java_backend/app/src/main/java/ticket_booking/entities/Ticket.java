package ticket_booking.entities;

import java.util.Date;


//
//@Getter
//@Setter


public class Ticket {


  private String ticketId;

  private String userId;

  private String source;
  private String destination;

  private ticket_booking.entities.Train train;

  private Date dateOfTravel;


  public Ticket(String userId, String ticketId, String source, String destination, Train train, Date dateOfTravel) {
    this.userId = userId;
    this.ticketId = ticketId;
    this.source = source;
    this.destination = destination;
    this.train = train;
    this.dateOfTravel = dateOfTravel;
  }

  public String getTicketInfo(){
    return String.format("Ticket Id : %s belongs to User %s from to %s on %s ", ticketId,userId,source,destination);
  }

  public String getTicketId() {
    return ticketId;
  }

  public void setTicketId(String ticketId) {
    this.ticketId = ticketId;
  }

  public Date getDateOfTravel() {
    return dateOfTravel;
  }

  public void setDateOfTravel(Date dateOfTravel) {
    this.dateOfTravel = dateOfTravel;
  }

  public Train getTrain() {
    return train;
  }

  public void setTrain(Train train) {
    this.train = train;
  }

  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


}









