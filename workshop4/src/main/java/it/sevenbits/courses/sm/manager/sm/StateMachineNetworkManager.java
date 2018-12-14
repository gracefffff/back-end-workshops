package it.sevenbits.courses.sm.manager.sm;


import it.sevenbits.courses.sm.log.MessageFormatter;
import it.sevenbits.courses.sm.manager.Context;
import it.sevenbits.courses.sm.manager.INetworkManager;
import it.sevenbits.courses.sm.manager.NetworkManagerException;
import it.sevenbits.courses.sm.manager.command.CommandTransition;
import it.sevenbits.courses.sm.manager.command.INetworkManagerCommand;
import it.sevenbits.courses.sm.network.INetwork;
import it.sevenbits.courses.sm.network.NetworkPackage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class StateMachineNetworkManager implements INetworkManager {
    private final static Logger logger = LoggerFactory.getLogger(StateMachineNetworkManager.class);
    private boolean isInterrupted = false;
    private final long TIMEOUT = 500;
    private final StateTransition stateTransition;

    public StateMachineNetworkManager() {
        this.stateTransition = new StateTransition();
    }

    @Override
    public void listen(INetwork network) throws NetworkManagerException {
        State currentState = stateTransition.getStartState();
        INetworkManagerCommand command;
        CommandTransition commandTransition = new CommandTransition();
        Context context = new Context();
        MessageFormatter messageFormatter = new MessageFormatter();

        try {
            while(!isInterrupted){
                while(network.hasPackage()) {
                    NetworkPackage p = network.getPackage();
                    command = commandTransition.getNextCommand(currentState, p.getType());
                    command.execute(context,p);
                    //logger.info("get part of message:" + p.getMessage());


                    currentState = stateTransition.nextState(currentState, p);
                    System.out.println(String.format(messageFormatter.getStringFormatByType(p.getType()),p.getMessage() ));
                   System.out.println(String.format("%1$s: %2$s", p.getType(), currentState.toString()));
                 //  System.out.println(context.getBuffer());


                }

                Thread.sleep(TIMEOUT);
            }
        } catch (InterruptedException e){

            logger.error("error");
            throw new NetworkManagerException("Network manager was interrupted unexpectedly", e);
        }
    }

    @Override
    public void stop() {
        logger.info("Stop");

        isInterrupted = true;
    }
}
