package Shop;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Receipt {
    private double amountPaid;
    private String paymentMethodDetails;
    private Date paymentDate;
    private String fullAddress;

    public Receipt(double amountPaid, String paymentMethodDetails, Date paymentDate, String fullAddress) {
        this.amountPaid = amountPaid;
        this.paymentMethodDetails = paymentMethodDetails;
        this.paymentDate = paymentDate;
        this.fullAddress = fullAddress;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return String.format("%.2f paid by %s on %s, and the delivery address is %s",
                             amountPaid, paymentMethodDetails, sdf.format(paymentDate), fullAddress);
    }
}
