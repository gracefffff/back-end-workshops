package it.sevenbits.courses.sm.manager;

import it.sevenbits.courses.sm.manager.command.INetworkManagerCommand;

public class Context {
private StringBuilder buffer;
    public Context() {
        buffer = new StringBuilder();
    }

    public StringBuilder getBuffer() {
        return buffer;
    }
    public String printBuf () {
        return buffer.toString();
    }

    public void add (String message){
        buffer.append(message);
    }
    public void clear () {
        buffer.setLength(0);
    }
}
