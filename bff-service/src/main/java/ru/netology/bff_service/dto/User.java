package ru.netology.bff_service.dto;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String fullName;
    private String address;
    private String phone;
    private String email;
}
