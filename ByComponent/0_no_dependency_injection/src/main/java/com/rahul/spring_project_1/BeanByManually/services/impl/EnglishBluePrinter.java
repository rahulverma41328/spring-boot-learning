package com.rahul.spring_project_1.BeanByManually.services.impl;

import com.rahul.spring_project_1.BeanByManually.services.BluePrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishBluePrinter implements BluePrinter {
    @Override
    public String print() {
        return "Blue";
    }
}
