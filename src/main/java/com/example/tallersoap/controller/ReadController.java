package com.example.tallersoap.controller;

import com.example.tallersoap.services.Read;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/read")
public class ReadController {
    @Autowired
    Read readService;

    @GetMapping("/{text}")
    public String read(@PathVariable String text) {
        return readService.readText(text) != null ? readService.readText(text) : "No se ha ingresado el texto";
    }
}
