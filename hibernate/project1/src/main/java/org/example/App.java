package org.example;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        // System.out.println( "Hello World!" );

        Configuration cf = new Configuration();
        cf.configure("hibernate.cfg.xml");
        SessionFactory factory = cf.buildSessionFactory();

    }
}
