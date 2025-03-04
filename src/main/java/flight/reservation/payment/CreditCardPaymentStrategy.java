package flight.reservation.payment;
import java.util.Date;
public class CreditCardPaymentStrategy implements PaymentStrategy {
    private CreditCard creditCard;

    public CreditCardPaymentStrategy(String number, Date expirationDate, String cvv) {
        this.creditCard = new CreditCard(number, expirationDate, cvv);
    }

    @Override
    public boolean pay(double amount) {
        if (creditCard.isValid() && creditCard.getAmount() >= amount) {
            System.out.println("Paying " + amount + " using Credit Card.");
            creditCard.setAmount(creditCard.getAmount() - amount);
            return true;
        } else {
            System.out.println("Credit Card payment failed due to insufficient funds or invalid card.");
            return false;
        }
    }
}
