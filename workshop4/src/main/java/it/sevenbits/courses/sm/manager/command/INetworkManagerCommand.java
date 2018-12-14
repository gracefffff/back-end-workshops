package it.sevenbits.courses.sm.manager.command;

import it.sevenbits.courses.sm.manager.Context;
import it.sevenbits.courses.sm.network.NetworkPackage;

public interface INetworkManagerCommand {
    void execute(Context context, NetworkPackage p);
}
