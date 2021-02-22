package com.example.messaging.domain;

import java.util.List;
import java.util.Map;

public class Message {

    private String id;
    private String from;
    private List<String> to;
    private String subject;
    private String content;
    private Map<String, String> attachments;


    public Message(String id, String from, List<String> to, String subject, String content, Map<String, String> attachments) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.content = content;
        this.attachments = attachments;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public List<String> getTo() {
        return to;
    }

    public void setTo(List<String> to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Map<String, String> getAttachments() {
        return attachments;
    }

    public void setAttachments(Map<String, String> attachments) {
        this.attachments = attachments;
    }
}
