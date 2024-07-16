package Design_Patterns.Behavioural.Chain_Of_Responsibility;

public abstract class AbstractHandler {

    private AbstractHandler nextHandler;

    public AbstractHandler(AbstractHandler nextHandler){
        this.nextHandler = nextHandler;
    }


    public void handleRequest(AbstractRequest request) {
        if(nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
