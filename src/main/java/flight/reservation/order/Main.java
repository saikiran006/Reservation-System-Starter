import flight.reservation.flight.ScheduledFlight;
import flight.reservation.order.FlightOrder;
import flight.reservation.payment.CreditCardPaymentStrategy;
import flight.reservation.payment.PayPalPaymentStrategy;

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ScheduledFlight flight1 = new ScheduledFlight("123", new Date(), 150);
        FlightOrder order = new FlightOrder(Arrays.asList(flight1));
        order.setPaymentStrategy(new CreditCardPaymentStrategy("1234567890123456", new Date(), "123"));
        order.processOrder();
        order.setPaymentStrategy(new PayPalPaymentStrategy("user@example.com", "password123"));
        order.processOrder();
    }
}
