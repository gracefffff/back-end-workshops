package it.sevenbits.courses.sm.manager.command;

import it.sevenbits.courses.sm.manager.sm.Pair;
import it.sevenbits.courses.sm.manager.sm.State;

import java.util.HashMap;

public class CommandTransition {
    private final CommandMap map;
    public CommandTransition() {
        map = new CommandMap();
    }
    public INetworkManagerCommand getNextCommand (State state, String type) {
        return map.get(state, type);
    }
}
