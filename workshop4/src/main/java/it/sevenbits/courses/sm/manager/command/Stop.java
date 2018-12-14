package it.sevenbits.courses.sm.manager.command;

import it.sevenbits.courses.sm.manager.Context;
import it.sevenbits.courses.sm.network.NetworkPackage;

public class Stop implements INetworkManagerCommand{
    @Override
    public void execute(Context context, NetworkPackage p) {
        context.clear();
    }
}
