package org.example.hexdemo.domain.port;

import org.example.hexdemo.domain.model.CustomerId;
import org.example.hexdemo.domain.model.Money;
import org.example.hexdemo.domain.model.ProductId;

public interface PaymentProcessor {

    String charge(CustomerId customerId, Money amount);


}
