package Design_Patterns.Behavioural.Command;

public class Client {
    public static void main(String[] args) {

        //Setting up the system
        BreakMechanism breakMechanism = new BreakMechanism();
        SuspensionMechanism suspensionMechanism = new SuspensionMechanism();

        ApplyBreakCommand applyBreakCommand = new ApplyBreakCommand(breakMechanism);
        AirSuspensionCommand airSuspensionCommand = new AirSuspensionCommand(suspensionMechanism);

        Panel panel = new Panel();

        panel.setCommand(0, airSuspensionCommand);
        panel.setCommand(1, applyBreakCommand);

        //Execute the commands
        panel.liftSuspension();
        panel.applyBreak();
    }
}
