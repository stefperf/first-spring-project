package com.example.springproject.utils;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("wolfQualifier")
public class Wolf implements Movable {
    @Override
    public String getName() {
        return "Wolf";
    }
}
