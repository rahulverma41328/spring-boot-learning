package org.example;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
         System.out.println( "Hello World!" );

         Configuration cfg = new Configuration();
         cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        // creating student
        Student student = new Student(23,"rahul","suratgarh");

        //creating address
        Address ad = new Address();

        ad.setStreet("street1");
        ad.setCity("suratgarh");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(1233);

        // set image

        FileInputStream fis = new FileInputStream("src/main/java/resources/image.png");

        byte[] data = new byte[fis.available()];
        fis.read(data);
        ad.setImage(data);
        Session session =  factory.openSession();
        session.beginTransaction();
      //  session.save(student);
        session.save(ad);
        session.getTransaction().commit();
        session.close();

        System.out.println(factory);
    }
}
