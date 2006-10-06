package com.comp.tasktracker.web.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class WebCommand {
	public abstract String execute( HttpServletRequest request, HttpServletResponse response);
}
