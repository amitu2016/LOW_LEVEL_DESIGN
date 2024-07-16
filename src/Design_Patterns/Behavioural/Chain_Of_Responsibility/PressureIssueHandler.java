package Design_Patterns.Behavioural.Chain_Of_Responsibility;

public class PressureIssueHandler extends AbstractHandler{

    private static int code = 303;

    public PressureIssueHandler(AbstractHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handleRequest(AbstractRequest request) {
        if (request.getRequestCode() == code){
            System.out.println("Handling the Pressure Issue Request");
        }else{
            super.handleRequest(request);
        }
    }
}
