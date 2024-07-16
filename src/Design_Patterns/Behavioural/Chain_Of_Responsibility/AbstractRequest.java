package Design_Patterns.Behavioural.Chain_Of_Responsibility;

public abstract class AbstractRequest {

    private int requestCode;

    public AbstractRequest(int requestCode){
        this.requestCode = requestCode;
    }

    public int getRequestCode() {
        return requestCode;
    }
}
