package com.example.messaging.domain;

public class UserFolder {

    String userName;
    // label name indicate folder. For example, inbox, social, promotion etc.
    String labelName;
    String color;

    public UserFolder(String userName, String labelName, String color) {
        this.userName = userName;
        this.labelName = labelName;
        this.color = color;
    }

    public UserFolder(){
        //default constructor.
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
