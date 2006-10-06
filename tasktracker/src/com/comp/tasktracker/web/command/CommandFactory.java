package com.comp.tasktracker.web.command;



public class CommandFactory { 
	
	public static WebCommand getCommand(String strCommandName){ 
		WebCommand sc = null;									
		if(strCommandName!=null&&strCommandName.length()>0){
			try{
				Class c = Class.forName("com.comp.tasktracker.web.command.Command"+strCommandName); //Should probably be changed to something less hard coded
				sc = (WebCommand) c.newInstance();			
			}catch(Exception e){
				sc = new CommandDefault();				
			}
		}else{
			sc = new CommandDefault();
		}
		return sc;	
	}

}
