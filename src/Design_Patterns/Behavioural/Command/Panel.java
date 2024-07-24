package Design_Patterns.Behavioural.Command;

public class Panel {

    Command [] commands = new Command[5];

    public Panel(){

    }

    public void setCommand(int index, Command command){
        commands[index] = command;
    }

    public void liftSuspension(){
        commands[0].execute();
    }

    public void applyBreak(){
        commands[1].execute();
    }
}
