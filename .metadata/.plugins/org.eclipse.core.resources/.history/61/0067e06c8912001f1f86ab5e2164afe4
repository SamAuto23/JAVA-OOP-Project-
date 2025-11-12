package Shop;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PayPalPayment implements PaymentMethod {
    private String email;

    public PayPalPayment(String email) {
        if (!isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid email address");
        }
        this.email = email;
    }

    @Override
    public Receipt processPayment(double amount, Address fullAddress) {
        Date today = new Date();
        String paymentDetails = "PayPal Email: " + email;
        return new Receipt(amount, paymentDetails, today, fullAddress.toString());
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
}
