package it.sevenbits.courses.sm.manager.command;

import it.sevenbits.courses.sm.manager.sm.Pair;
import it.sevenbits.courses.sm.manager.sm.State;

import java.util.HashMap;

public class CommandMap {
    private final HashMap<Pair <State,String>, INetworkManagerCommand> map;



    public CommandMap() {
        State defaultState = new State("IGNORE");
             State listenState = new State("LISTEN");
         State stubSuspicion = new State("TRASH_SUSPICION");
        map = new HashMap<>();

        map.put(new Pair<>(defaultState, "MESSAGE"), new Skip());
        map.put(new Pair<>(defaultState, "TRASH"), new Skip());

        map.put(new Pair<>(defaultState, "MESSAGE_FINISH"), new Skip());
        map.put(new Pair<>(defaultState, "MESSAGE_START"), new Skip());

        map.put(new Pair<>(listenState, "MESSAGE"), new AddCommandNetworkManager());
        map.put(new Pair<>(listenState, "TRASH"), new Skip());
        map.put(new Pair<>(listenState, "MESSAGE_FINISH"), new Skip());
        map.put(new Pair<>(listenState, "MESSAGE_START"), new Skip());

        map.put(new Pair<>(stubSuspicion, "MESSAGE"), new AddCommandNetworkManager());
        map.put(new Pair<>(stubSuspicion, "TRASH"), new Print());
        map.put(new Pair<>(stubSuspicion, "MESSAGE_FINISH"), new Stop());
        map.put(new Pair<>(stubSuspicion, "MESSAGE_START"), new Skip());

    }
    public INetworkManagerCommand get (State state, String type){
        return map.get(new Pair<>(state, type));
    }
}
