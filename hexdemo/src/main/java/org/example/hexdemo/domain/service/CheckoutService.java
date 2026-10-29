package org.example.hexdemo.domain.service;

import org.example.hexdemo.domain.model.Cart;
import org.example.hexdemo.domain.model.Customer;
import org.example.hexdemo.domain.model.Money;
import org.example.hexdemo.domain.model.Receipt;
import org.example.hexdemo.domain.port.PricingPolicy;

import java.math.BigDecimal;

public class CheckoutService {

    private final PricingPolicy pricingPolicy;

    public CheckoutService(PricingPolicy pricingPolicy) {
        this.pricingPolicy = pricingPolicy;
    }

    public Receipt checkout(Cart cart, Customer customer){

        //Total price?
        Money total = pricingPolicy.priceFor(cart, customer);

        //Boka produkter på lager


        //Ta betalt via betalningsleverantör


        //Skicka notifikation

        return  new Receipt("xxx", total);

    }

}
