package Shop;

import java.util.Date;

public class CreditCardPayment implements PaymentMethod {
    private String cardNumber;
    private String securityCode;

    public CreditCardPayment(String cardNumber, String securityCode) {
        if (!isValidCardNumber(cardNumber) || !isValidSecurityCode(securityCode)) {
            throw new IllegalArgumentException("Invalid card number or security code");
        }
        this.cardNumber = cardNumber;
        this.securityCode = securityCode;
    }

    @Override
    public Receipt processPayment(double amount, Address fullAddress) {
        Date today = new Date();
        String paymentDetails = "Credit Card Number: " + cardNumber;
        return new Receipt(amount, paymentDetails, today, fullAddress.toString());
    }

    private boolean isValidCardNumber(String cardNumber) {
        return cardNumber != null && cardNumber.matches("\\d{6}");
    }

    private boolean isValidSecurityCode(String securityCode) {
        return securityCode != null && securityCode.matches("\\d{3}");
    }
}
