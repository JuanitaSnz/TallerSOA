package com.example.tallersoap.services;

import org.springframework.stereotype.Service;

@Service
public class Normalize {

    public String normalizeString(String text){
        return text.toLowerCase().replaceAll("[^a-zA-Z]","");
    }

}
