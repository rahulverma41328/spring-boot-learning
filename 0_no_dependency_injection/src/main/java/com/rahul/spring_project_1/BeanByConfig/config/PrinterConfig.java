package com.rahul.spring_project_1.BeanByConfig.config;

import com.rahul.spring_project_1.BeanByManually.services.BluePrinter;
import com.rahul.spring_project_1.BeanByManually.services.ColourPrinter;
import com.rahul.spring_project_1.BeanByManually.services.GreenPrinter;
import com.rahul.spring_project_1.BeanByManually.services.RedPrinter;
import com.rahul.spring_project_1.BeanByManually.services.impl.ColourPrinterImpl;
import com.rahul.spring_project_1.BeanByManually.services.impl.EnglishBluePrinter;
import com.rahul.spring_project_1.BeanByManually.services.impl.EnglishGreenPrinter;
import com.rahul.spring_project_1.BeanByManually.services.impl.EnglishRedPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {

    @Bean
    public BluePrinter bluePrinter(){
        return new EnglishBluePrinter();
    }

    @Bean
    public GreenPrinter greenPrinter(){
        return new EnglishGreenPrinter();
    }

    @Bean
    public RedPrinter redPrinter(){
        return new EnglishRedPrinter();
    }

    @Bean
    public ColourPrinter colourPrinter(RedPrinter redPrinter,BluePrinter bluePrinter,GreenPrinter greenPrinter){
        return new ColourPrinterImpl(redPrinter,bluePrinter,greenPrinter);
    }
}
