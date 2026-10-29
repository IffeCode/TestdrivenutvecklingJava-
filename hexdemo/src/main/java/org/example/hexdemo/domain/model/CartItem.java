package org.example.hexdemo.domain.model;

public record CartItem(ProductId productId, Money unitPrice, int quantity) {
}
