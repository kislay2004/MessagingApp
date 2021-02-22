package com.example.messaging.domain;

public class Attachment {

    private String messageId;
    private String fileName;
    private int chunkNumber;
    private String content;

    public Attachment(String messageId, String fileName, int checkNumber, String content) {
        this.messageId = messageId;
        this.fileName = fileName;
        this.chunkNumber = checkNumber;
        this.content = content;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getChunkNumber() {
        return chunkNumber;
    }

    public void setChunkNumber(int chunkNumber) {
        this.chunkNumber = chunkNumber;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
