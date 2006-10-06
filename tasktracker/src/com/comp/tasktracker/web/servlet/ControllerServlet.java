package com.comp.tasktracker.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControllerServlet extends HttpServlet {
	
	private String getCommand(HttpServletRequest request){
		String arrURI[] = request.getRequestURI().split("/");
		String strCommand = arrURI[arrURI.length-1].split("[.]")[0];
		return strCommand;
	}
	
	
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException {			
		String arrURI[] = request.getRequestURI().split("/");
		String strCommand = arrURI[arrURI.length-1].split("[.]")[0];									
					
		System.out.println("Command: "+strCommand);
	}

}
