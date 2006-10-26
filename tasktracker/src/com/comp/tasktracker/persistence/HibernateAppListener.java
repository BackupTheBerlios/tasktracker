package com.comp.tasktracker.persistence;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletException;

import org.apache.log4j.Logger;
import org.hibernate.Session;

public class HibernateAppListener implements ServletContextListener{

    private static final boolean DEBUG = true;

    private static final String hibernateUtilClassName = "com.comp.tasktracker.persistence.HibernateUtil";

    /* Application Startup Event */
    public void contextInitialized(ServletContextEvent ce){

        try{
            if(DEBUG)System.out.println(this.getClass().getName() + ".contextInitialized(ServletContextEvent ce) ->");

            Class.forName(hibernateUtilClassName).newInstance();
            if(DEBUG)System.out.println("In HibernateAppListener, Class.forName for " + hibernateUtilClassName + " successful");
        }
        catch(Exception e){
            if(DEBUG)System.out.println("In HibernateAppListener, Class.forName for " + hibernateUtilClassName + " throws Exception");
        }
    }

    /* Application Shutdown Event */
    public void contextDestroyed(ServletContextEvent ce){
    }
}