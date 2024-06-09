package com.rahul.spring_project_1.BeanByManually.services.impl;

import com.rahul.spring_project_1.BeanByManually.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishRedPrinter implements RedPrinter {
    @Override
    public String print() {
        return "Red";
    }
}
