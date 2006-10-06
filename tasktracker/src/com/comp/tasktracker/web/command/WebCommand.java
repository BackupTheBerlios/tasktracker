package com.comp.tasktracker.web.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Abstract Base class for commands
 * 
 * 
 *
 */
public abstract class WebCommand {
	public abstract String execute( HttpServletRequest request, HttpServletResponse response);
}
