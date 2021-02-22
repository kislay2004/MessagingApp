package com.example.messaging.controller;

import com.example.messaging.domain.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//TODO: Error handling - what is something is not found? Or, Bad Request etc.
//TODO: Add swagger docs.
//TODO: Add Spring security  and related error handling.
//TODO: Add configuration based, repo/other env config support.
//TODO: Add lombok
//TODO: Add Tests - using embedded mongo may be!?

@RestController
public class MessageController {

    @RequestMapping("/")
    public String index() {
        return "This project to showcase services in an email system";
    }

    @RequestMapping("/userFolders/{userId}")
    public List<UserFolder> getUserFolders(@PathVariable String userId) {
        return MockData.getFolders(userId);
    }

    @RequestMapping("/messages/{userId}/{folderName}")
    public List<UserMessage> getMessageByUserFolder(@PathVariable String userId, @PathVariable String folderName) {
        return MockData.getMessagesByUserFolder(userId, folderName);
    }

    @RequestMapping("/message/{id}")
    public Message getMessage(@PathVariable("id") String messageId) {
        return MockData.getMessageById(messageId);
    }

    @RequestMapping("/attachment/{id}")
    public Attachment getAttachment(@PathVariable("id") String attachmentId) {
        return MockData.getAttachmentById(attachmentId);
    }

}
