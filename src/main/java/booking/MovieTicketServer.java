package booking;

/**
 * This class is responsible for booking tickets for a movie
 */
public class MovieTicketServer {
private String movieName;
private int availableTickets; //change this to volatile for tasks

  /**
   * Constructor
   * @param movieName
   * @param availableTickets
   *
   * Creates a move ticket server with a given movie name and available tickets
   */
  public MovieTicketServer(String movieName, int availableTickets) {
    this.movieName = movieName;
    this.availableTickets = availableTickets;
}

  /**
   * @param name
   * @param tickets
   *
   * Books tickets for a movie
   */
  public synchronized void bookTicket(String name, int tickets) {
  if (availableTickets >= tickets) {
    System.out.println(name + " booked " + tickets + " tickets for " + movieName);
    availableTickets -= tickets;
  } else {
    System.out.println(
        "Sorry, " + name + " we only have " + availableTickets + " tickets left for " + movieName);
  }
}


}
