package org.example;

import org.springframework.stereotype.Service;

@Service
public class Writer implements IWriter{
    @Override
    public String writer (String s){
        return "String: "+s;
    }
}
