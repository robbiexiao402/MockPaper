package movieticketgui;

import org.junit.Test;
import static org.junit.Assert.*;

public class MovieTicketsTest {
    @Test
    public void CalculateTotalTicketPrice_CalculatedSuccessfully() {
        MovieTickets movieTicket = new MovieTickets();
        
        double totalPrice = movieTicket.CalculateTotalTicketPrice(3, 10.5);
        
        assertEquals(36.225, totalPrice, totalPrice);
    }
    
    @Test
    public void ValidateInvalidDataInput() {
        MovieTickets movieTicket = new MovieTickets();
        
        boolean invalidInput = movieTicket.ValidateData("", 3, 10.5);
        
        assertEquals(false, invalidInput);
    }
}
