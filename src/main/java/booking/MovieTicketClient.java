package booking;

/**
 * This class represents a client that will book tickets for a movie.
 */
public class MovieTicketClient extends Thread {
  private MovieTicketServer movieTicketServer;
  private String clientName;
  private int numberOfTickets;

  /**
   * Constructor for the MovieTicketClient class.
   *
   * @param movieTicketServer The server that the client will book tickets from.
   * @param clientName The name of the client.
   * @param numberOfTickets The number of tickets that the client wants to book.
   */
  public MovieTicketClient(MovieTicketServer movieTicketServer, String clientName, int numberOfTickets) {
    this.movieTicketServer = movieTicketServer;
    this.clientName = clientName;
    this.numberOfTickets = numberOfTickets;
  }

  /**
   * This method will book tickets for the client.
   */
  public void bookTickets() {
    this.movieTicketServer.bookTickets(this.clientName, this.numberOfTickets);
  }
}
