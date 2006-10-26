package com.comp.tasktracker.web.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.comp.tasktracker.model.Settings;
import com.comp.tasktracker.model.User;
import com.comp.tasktracker.persistence.HibernateUtil;
import com.comp.tasktracker.web.constants.WebConst;

public class CommandListUserTest extends WebCommand{

    @Override
    public String execute(HttpServletRequest request,
            HttpServletResponse response){

        /*
         * To be implemented
         */

        User user = new User("Otto", "Sjögren");
        user.setSettings(new Settings(60));

        return WebConst.HOME;
    }
}
