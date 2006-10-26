package com.comp.tasktracker.web.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.comp.tasktracker.model.Settings;
import com.comp.tasktracker.model.User;
import com.comp.tasktracker.persistence.HibernateUtil;
import com.comp.tasktracker.web.constants.WebConst;

public class CommandAddUserTest extends WebCommand{

    @Override
    public String execute(HttpServletRequest request,
            HttpServletResponse response){

        /*
         * 1. Fetch user properties
         */

        User user = new User("Otto", "Sjögren");
        user.setSettings(new Settings(60));

        /*
         * 2. Make user persistent
         */
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();

            session.save(user);

            // Automatically closes session
            session.getTransaction().commit();
        }
        catch(HibernateException e){
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return WebConst.HOME;
    }

}
