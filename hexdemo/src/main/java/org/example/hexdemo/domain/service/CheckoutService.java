package org.example.hexdemo.domain.service;

import org.example.hexdemo.domain.model.Cart;
import org.example.hexdemo.domain.model.Customer;
import org.example.hexdemo.domain.model.Money;
import org.example.hexdemo.domain.model.Receipt;

import java.math.BigDecimal;

public class CheckoutService {

    public Receipt checkout(Cart cart, Customer customer){

        //Total price?


        //Boka produkter på lager


        //Ta betalt via betalningsleverantör


        //Skicka notifikation

        return  new Receipt("xxx", new Money(BigDecimal.ONE));

    }

}
