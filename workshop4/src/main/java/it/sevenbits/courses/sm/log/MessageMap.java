package it.sevenbits.courses.sm.log;

import java.util.HashMap;
import java.util.Map;

public class MessageMap {
    private final HashMap<String, String> map;

    public MessageMap() {
        map = new HashMap<>();
        map.put("MESSAGE","Part of message: %1$s");
        map.put("TRASH","Trash received");
        map.put("MESSAGE_START","Message creating started");
        map.put("MESSAGE_FINISH","Message creating finished");

    }
    public  String getLog(String type) {
       return map.getOrDefault(type,"Unknown package type");
    }



}
