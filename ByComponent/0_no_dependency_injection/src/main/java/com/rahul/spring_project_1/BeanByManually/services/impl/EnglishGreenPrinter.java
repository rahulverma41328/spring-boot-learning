package com.rahul.spring_project_1.BeanByManually.services.impl;

import com.rahul.spring_project_1.BeanByManually.services.GreenPrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishGreenPrinter implements GreenPrinter {
    @Override
    public String print() {
        return "Green";
    }
}
