package com.comp.tasktracker.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.comp.tasktracker.web.command.WebCommand;
import com.comp.tasktracker.web.command.CommandFactory;;


public class ControllerServlet extends HttpServlet {
	
	private WebCommand getCommand(HttpServletRequest request){
		String arrURI[] = request.getRequestURI().split("/");
		String strCommand = arrURI[arrURI.length-1].split("[.]")[0];
		WebCommand command = CommandFactory.getCommand(strCommand);
		return command;
	}
	
	
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException {			
		WebCommand command = getCommand(request);
		String strPageFileName = command.execute(request, response);
		
		try{ //skicka vidare till rätt jsp-sida
			RequestDispatcher rd = this.getServletConfig().getServletContext().getRequestDispatcher("/"+strPageFileName);     
			rd.forward(request, response);
		}catch(Exception e){
			System.err.println(e.toString());
		}
	}

}
