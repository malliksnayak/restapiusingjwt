package com.nayakm.apidevelopment.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestContoller {
    @GetMapping("/test/all")
    public String allAccess() {
        return "Public Content - accessible by everyone!";
    }

    @GetMapping("/secure/user")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public String userAccess() {
        return "User Content - requires authentication!";
    }

    @GetMapping("/secure/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminAccess() {
        return "Admin Board - requires ADMIN role!";
    }
}
