package com.comp.tasktracker.web.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.comp.tasktracker.web.constants.WebConst;

public class CommandPersistenceTest extends WebCommand {

    @Override
    public String execute(HttpServletRequest request,
            HttpServletResponse response) {
        // TODO Auto-generated method stub
        return WebConst.HOME;
    }

}
