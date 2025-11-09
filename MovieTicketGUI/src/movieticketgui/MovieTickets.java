package movieticketgui;

public class MovieTickets implements IMovieTickets {
    @Override
    public double CalculateTotalTicketPrice(int numberOfTickets, double ticketPrice) {
        return (ticketPrice * numberOfTickets) + (ticketPrice * numberOfTickets * 0.15);
    }
    
    @Override
    public boolean ValidateData(String movieName, int numberOfTickets, double ticketPrice) {
        if (movieName.isEmpty() || numberOfTickets <= 0 || ticketPrice <= 0) {
            return false;
        }
        
        return true;
    }
}
