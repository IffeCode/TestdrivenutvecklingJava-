package org.example.hexdemo.config;

import org.example.hexdemo.domain.port.Inventory;
import org.example.hexdemo.domain.port.PricingPolicy;
import org.example.hexdemo.domain.service.CheckoutService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    CheckoutService checkoutService(

            ) {
        return new CheckoutService(null, null, null, null);
    }

}
