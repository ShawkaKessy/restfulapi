package ru.netology.bff_service.dto;

import lombok.Data;
import java.util.List;

@Data
public class Order {
    private Long id;
    private Long userId;
    private Double amount;
    private String currency;
    private List<String> items;
}
