package com.example.tallersoap.controller;

import com.example.tallersoap.services.CountWords;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/wordCount")

public class CountWordController {

    @Autowired CountWords countWordsService;

    @GetMapping("/{text}")
    public ResponseEntity<?> countWords(@PathVariable String text){
        if(text == null || text.trim().isEmpty()){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No se ha ingresado el texto");
        }
        Map<String,Integer> result= countWordsService.countWords(text);
        return  ResponseEntity.ok(result);
    }
}
