package com.comp.tasktracker.model;

public class Settings{

    private long id;

    private int workDayMinutes;

    public Settings(){}

    public Settings(int workDayMinutes){
        this.workDayMinutes = workDayMinutes;
    }

    public int getWorkDayMinutes(){
        return workDayMinutes;
    }

    public void setWorkDayMinutes(int workDayMinutes){
        this.workDayMinutes = workDayMinutes;
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    
}
