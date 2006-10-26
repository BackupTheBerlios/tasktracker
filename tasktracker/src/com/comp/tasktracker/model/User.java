package com.comp.tasktracker.model;

public class User{

    private long id;

    private String surName;

    private String familyName;

    private Settings settings;

    public User(){}

    public User(String surName, String familyName){
        this.surName = surName;
        this.familyName = familyName;
    }

    public String getFamilyName(){
        return familyName;
    }

    public void setFamilyName(String familyName){
        this.familyName = familyName;
    }

    public Settings getSettings(){
        return settings;
    }

    public void setSettings(Settings settings){
        this.settings = settings;
    }

    public String getSurName(){
        return surName;
    }

    public void setSurName(String surName){
        this.surName = surName;
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

}
