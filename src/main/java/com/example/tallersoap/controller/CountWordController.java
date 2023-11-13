package com.example.tallersoap.controller;

import com.example.tallersoap.services.CountWords;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin(origins = "http://127.0.0.1:5500")
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
