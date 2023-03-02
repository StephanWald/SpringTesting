package org.example;

import org.springframework.stereotype.Service;

@Service
public class NiceWriter implements IWriter {
    @Override
    public String writer (String s){
        return "The string is " + s;
    }
}