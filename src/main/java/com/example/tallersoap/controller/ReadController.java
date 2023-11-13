package com.example.tallersoap.controller;

import com.example.tallersoap.services.Read;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://127.0.0.1:5500")
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
