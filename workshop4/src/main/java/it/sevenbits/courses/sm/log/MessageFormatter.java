package it.sevenbits.courses.sm.log;

import java.util.HashMap;

// TODO: make Map
public class MessageFormatter {
private MessageMap messageMap = new MessageMap();
    public String getStringFormatByType(String type){
     return messageMap.getLog(type);


    }
}
