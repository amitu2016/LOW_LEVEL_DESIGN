package Design_Patterns.Behavioural.Chain_Of_Responsibility;

public class EngineIssueHandler extends AbstractHandler{

    private static int code = 304;

    public EngineIssueHandler(AbstractHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handleRequest(AbstractRequest request) {
        if (request.getRequestCode() == code){
            System.out.println("Handling the Engine Issue Request");
        }else{
            super.handleRequest(request);
        }
    }
}
