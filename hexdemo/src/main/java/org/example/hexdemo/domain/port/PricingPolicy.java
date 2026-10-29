package org.example.hexdemo.domain.port;

import org.example.hexdemo.domain.model.Cart;
import org.example.hexdemo.domain.model.Customer;
import org.example.hexdemo.domain.model.Money;

public interface PricingPolicy {

    Money priceFor(Cart cart, Customer customer);

}
