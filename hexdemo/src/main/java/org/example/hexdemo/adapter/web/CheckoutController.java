package org.example.hexdemo.adapter.web;

import jakarta.validation.constraints.*;
import org.example.hexdemo.domain.model.ProductId;
import org.example.hexdemo.domain.service.CheckoutService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    public final CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }




    public static class CheckoutRequest {

        @NotBlank(message = "Cannot be empty!")
        public String customerId;

        @Email @NotBlank
        public String email;

        @NotEmpty(message = "Cannot be empty")
        public List<Item> itemns;

        public static  class Item {
            @NotBlank
            public String productId;

            @Positive
            public int quantity;

            @NotNull @DecimalMin("0.0")
            public BigDecimal unitPrice;

        }


    }


}
