package org.example.hexdemo.domain.port;

import org.example.hexdemo.domain.model.CustomerId;
import org.example.hexdemo.domain.model.Money;

public interface Notifier {

    void orderConfirmation(String paymentId, CustomerId customerId);

}
