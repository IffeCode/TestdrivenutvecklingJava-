package org.example.hexdemo.domain.service;

import org.example.hexdemo.domain.model.*;
import org.example.hexdemo.domain.port.Inventory;
import org.example.hexdemo.domain.port.PaymentProcessor;
import org.example.hexdemo.domain.port.PricingPolicy;

import java.math.BigDecimal;

public class CheckoutService {

    private final PricingPolicy pricingPolicy;
    private final Inventory inventory;
    private final PaymentProcessor paymentProcessor;

    public CheckoutService(PricingPolicy pricingPolicy, Inventory inventory,
                           PaymentProcessor paymentProcessor) {
        this.pricingPolicy = pricingPolicy;
        this.inventory = inventory;
        this.paymentProcessor = paymentProcessor;
    }

    public Receipt checkout(Cart cart, Customer customer){

        //Total price?
        Money total = pricingPolicy.priceFor(cart, customer);

        //Boka produkter på lager
        for (CartItem ci: cart.items()){
            if (!inventory.reserve(ci.productId(), ci.quantity())){
                throw new IllegalStateException("Cannot reserve product " + ci.productId()
                        + " with quantity " + ci.quantity());
            }
        }

        //Ta betalt via betalningsleverantör


        //Skicka notifikation

        return  new Receipt("xxx", total);

    }

}
