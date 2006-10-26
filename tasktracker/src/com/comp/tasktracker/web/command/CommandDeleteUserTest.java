package com.comp.tasktracker.web.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.comp.tasktracker.model.Settings;
import com.comp.tasktracker.model.User;
import com.comp.tasktracker.persistence.HibernateUtil;
import com.comp.tasktracker.web.constants.WebConst;

public class CommandDeleteUserTest extends WebCommand{

    @Override
    public String execute(HttpServletRequest request,
            HttpServletResponse response){

        /*
         * 1. Fetch which item to delete
         */
        String userIdStr = "14";


        try{
            long userIdLong = Long.parseLong(userIdStr);
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();

            User user = (User)session.get(User.class, userIdLong);
            if(user != null){
                session.delete(user);
            }
            else{
                request.setAttribute("error", "User with id: " + userIdStr + " doesn't exist");
            }

            // Automatically closes session
            session.getTransaction().commit();
        }
        catch(HibernateException e){
            e.printStackTrace();
        }

        return WebConst.HOME;
    }

}
