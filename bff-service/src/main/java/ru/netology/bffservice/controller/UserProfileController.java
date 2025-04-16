package ru.netology.bffservice.controller;

import org.springframework.web.bind.annotation.*;
import ru.netology.bffservice.dto.UserProfileDto;
import ru.netology.bffservice.service.UserProfileService;

@RestController
@RequestMapping("/api")
public class UserProfileController {

    private final UserProfileService service;

    public UserProfileController(UserProfileService service) {
        this.service = service;
    }

    @GetMapping("/users/{userId}/orders")
    public UserProfileDto getUserProfile(@PathVariable Long userId) {
        return service.getUserProfile(userId);
    }
}
