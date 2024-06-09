package com.rahul.spring_project_1.BeanByManually.services.impl;

import com.rahul.spring_project_1.BeanByManually.services.BluePrinter;
import com.rahul.spring_project_1.BeanByManually.services.ColourPrinter;
import com.rahul.spring_project_1.BeanByManually.services.GreenPrinter;
import com.rahul.spring_project_1.BeanByManually.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class ColourPrinterImpl implements ColourPrinter {

    private RedPrinter redPrinter;
    private BluePrinter bluePrinter;
    private GreenPrinter greenPrinter;

    public ColourPrinterImpl(RedPrinter redPrinter,BluePrinter bluePrinter,GreenPrinter greenPrinter) {
        this.redPrinter = redPrinter;
        this.bluePrinter = bluePrinter;
        this.greenPrinter = greenPrinter;
    }

    @Override
    public String print() {
        return String.join(", ",redPrinter.print(),bluePrinter.print(),greenPrinter.print());
    }
}
