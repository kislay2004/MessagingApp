package com.example.messaging.domain;

public class UserMessage {

    private String userName;
    private String label;
    //TODO: consider changing it to UUID perhaps!?
    private String messageId;
    private String from;
    private String subject;
    private boolean isRead;

    public UserMessage(){

    }

    public UserMessage(String userName, String label, String messageId, String from, String subject, boolean isRead) {
        this.userName = userName;
        this.label = label;
        this.messageId = messageId;
        this.from = from;
        this.subject = subject;
        this.isRead = isRead;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setIsRead(boolean isRead) {
        this.isRead = isRead;
    }
}
