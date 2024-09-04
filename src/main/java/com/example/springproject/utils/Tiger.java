package com.example.springproject.utils;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("tigerQualifier")
public class Tiger
        implements Movable {
    @Override
    public String getName() {
        return "Tiger";
    }

    @Override
    public String verb() {
        return "jumps";
    }
}
