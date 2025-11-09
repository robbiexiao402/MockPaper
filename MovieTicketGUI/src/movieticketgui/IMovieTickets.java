package movieticketgui;

public interface IMovieTickets {
    double CalculateTotalTicketPrice(int numberOfTickets, double ticketPrice);
    boolean ValidateData(String movieName, int numberOfTickets, double ticketPrice);
}
