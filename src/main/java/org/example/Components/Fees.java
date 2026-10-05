package org.example.Components;

import java.time.LocalDateTime;

public class Fees {
    private final double amount;
    private final String type;
    private final String paymentMethod;
    private final LocalDateTime issueDateTime;
    private final LocalDateTime paymentDateTime;

    public Fees(double amount, String type, String paymentMethod, LocalDateTime issueDateTime, LocalDateTime paymentDateTime) {
        this.amount = amount;
        this.type = type;
        this.paymentMethod = paymentMethod;
        this.issueDateTime = issueDateTime;
        this.paymentDateTime = paymentDateTime;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public LocalDateTime getIssueDateTime() {
        return issueDateTime;
    }

    public LocalDateTime getPaymentDateTime() {
        return paymentDateTime;
    }

    @Override
    public String toString() {
        return  "Fees issue date and time: " + issueDateTime +
                ", amount: " + amount +
                ", type: " + type +
                ", payment method: " + paymentMethod +
                ", payment date and time=" + paymentDateTime + "\n";
    }
}
