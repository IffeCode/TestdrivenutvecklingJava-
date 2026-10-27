package org.example;

public class OrderService {

    private InventoryService inventoryService;

    private OrderRepository orderRepository;

    public OrderService(InventoryService inventoryService,
                        OrderRepository orderRepository) {
        this.inventoryService = inventoryService;
        this.orderRepository = orderRepository;
    }


}
