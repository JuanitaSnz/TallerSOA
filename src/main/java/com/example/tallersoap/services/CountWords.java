package com.example.tallersoap.services;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class CountWords {

    public Map<String,Integer> countWords(String text){
        Map<String,Integer> wordFrequency = new HashMap<>();
        String regex= "\\b\\w+\\b";
        if(text == null){
            wordFrequency.put("message",0);
            return wordFrequency;
        }else{
            Pattern pattern= Pattern.compile(regex);
            Matcher matcher=pattern.matcher(text);

            while (matcher.find()){
                String word=matcher.group();
                wordFrequency.put(word,wordFrequency.getOrDefault(word,0)+1);
            }
        }
    return wordFrequency;
    }


}
