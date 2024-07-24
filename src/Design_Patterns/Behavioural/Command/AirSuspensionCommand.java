package Design_Patterns.Behavioural.Command;

public class AirSuspensionCommand implements Command{

    SuspensionMechanism suspensionMechanism;

    public AirSuspensionCommand(SuspensionMechanism suspensionMechanism){
        this.suspensionMechanism = suspensionMechanism;
    }

    @Override
    public void execute() {
        suspensionMechanism.liftSuspension();
    }
}
