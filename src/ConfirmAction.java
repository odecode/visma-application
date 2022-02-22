public class ConfirmAction extends AbstractAction{
    private String paymentNumber;
    public ConfirmAction(String src, String param){
        super();
        this.source = src;
        this.parameter = param;
        this.action = this;
        this.actionName = "Confirm";
        this.paymentNumber = parseParameter(param);
    }

    public AbstractAction getAction(){
        return this.action;
    }

    private String parseParameter(String payNum){
        int cutoff = payNum.indexOf("=")+1;
        String actualNum = payNum.substring(cutoff);
        return actualNum;
    }

    @Override
    public void doAction() {
        System.out.println("Confirming " +this.source+ " with payment number " +this.paymentNumber);
        
    }
    
}
