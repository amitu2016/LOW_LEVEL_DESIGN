package Design_Patterns.Behavioural.Chain_Of_Responsibility;

public class Client {
    public static void main(String[] args) {
       AbstractHandler pressureHandler = new PressureIssueHandler(null);
       AbstractHandler engineIssueHandler = new EngineIssueHandler(pressureHandler);

       AbstractRequest request = new PressureIssueRequest();
      //  AbstractRequest request1 = new EngineIssueRequest();

       engineIssueHandler.handleRequest(request);
    }
}
