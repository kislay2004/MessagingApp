package com.example.messaging.domain;

import java.util.*;

//mocked/hard-coded data for testing purpose.
public class MockData {


    private static final String ID1 = "8d13fc3a-6eaa-49e6-a732-94232d129d3a";
    private static final String ID2 = "8d13fc3a-6eaa-49e6-a732-94232d129d3a";
    private static final String ID3 = "8d13fc3a-6eaa-49e6-a732-94232d129d3a";
    private static final String ID4 = "8d13fc3a-6eaa-49e6-a732-94232d129d3a";

    public static List<UserFolder> getFolders(String userId) {
        List<UserFolder> userFolders = new ArrayList<>();
        userFolders.add(new UserFolder("Ram", "inbox", "blue"));
        userFolders.add(new UserFolder("Ram", "social", "green"));
        userFolders.add(new UserFolder("Ram", "promotion", "grey"));
        return userFolders;
    }

    public static List<UserMessage> getMessagesByUserFolder(String userId, String folderName) {
        List<UserMessage> userMessages = new ArrayList<>();
        userMessages.add(new UserMessage("Ram","inbox", ID1,"Hanuman", "Reached Lanka" , false));
        userMessages.add(new UserMessage("Ram","inbox", ID2,"Hanuman", "Met Vibhishana" , false));
        userMessages.add(new UserMessage("Ram","inbox", ID3,"Hanuman", "Set Lanka Place on Fire" , false));
        userMessages.add(new UserMessage("Ram","inbox", ID4,"Hanuman", "On my way back! More once we meet.." , false));
        return userMessages;
    }

    public static Message getMessageById(String messageId) {

        //some issue with below data modelling!? Does not looks good..
        Map<String, String> attachmentMap = new HashMap<>();
        attachmentMap.put("image1", "chunkNumber1" );
        attachmentMap.put("image2", "chunkNumber2");

        Message message = new Message("Ram","Hanuman",
                Arrays.asList("Ram", "Laxman", "Sugreev"), "Reached Lanka", "I have reached lanka safely. PFA, some photos.",
                attachmentMap);

        return message;
    }

    public static Attachment getAttachmentById(String attachmentId) {
        Attachment attachment = new Attachment(ID1,"image1", 1, "dummy_image_content");
        return attachment;
    }
}
