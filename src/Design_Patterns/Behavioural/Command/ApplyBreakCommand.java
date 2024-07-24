package Design_Patterns.Behavioural.Command;

public class ApplyBreakCommand implements Command{

    BreakMechanism breakMechanism;

    public ApplyBreakCommand(BreakMechanism breakMechanism) {
        this.breakMechanism = breakMechanism;
    }

    @Override
    public void execute() {
        breakMechanism.applyBreak();
    }
}
