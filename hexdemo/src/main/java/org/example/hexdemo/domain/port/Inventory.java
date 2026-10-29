package org.example.hexdemo.domain.port;

import org.example.hexdemo.domain.model.Customer;
import org.example.hexdemo.domain.model.ProductId;

public interface Inventory {

    boolean reserve(ProductId productId, int quantity);

}
