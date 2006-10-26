package com.comp.tasktracker.persistence;

import java.util.logging.Logger;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil{

    private static final boolean DEBUG = true;

    private static final SessionFactory sessionFactory;

    static{
        try{
            if(DEBUG)
                System.out.println("In HibernateUtil try-clause");
            if(DEBUG)
                System.out.println("In HibernateUtil try-clause via loggerConnect DEBUG*****");

            // Create the SessionFactory from hibernate.cfg.xml
            sessionFactory = new Configuration().configure()
                    .buildSessionFactory();
        }
        catch(Throwable ex){
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
