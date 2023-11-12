package com.example.tallersoap.controller;

import com.example.tallersoap.services.Normalize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/normalize")
public class NormalizeController {
    @Autowired
    Normalize normalizeService;

    @GetMapping("/{text}")
    public String normalize(@PathVariable String text) {
        return normalizeService.normalizeString(text) != null ? normalizeService.normalizeString(text): "No se ha ingresado el texto";
    }
}
