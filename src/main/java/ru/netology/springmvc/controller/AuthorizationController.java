package ru.netology.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.springmvc.Authorities;
import ru.netology.springmvc.domain.User;
import ru.netology.springmvc.service.AuthorizationService;

import java.util.List;

@RestController
public class AuthorizationController {

    @Autowired
    AuthorizationService service;

    @GetMapping("/all")
    public String getAll() {
        return "testAll";
    }

    @GetMapping("/write")
    public String getWrite() {
        return "testWrite";
    }

    @GetMapping("/read")
    public String getRead() {
        return "testRead";
    }

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@Validated User user) {
        return service.getAuthorities(user);
    }
}

