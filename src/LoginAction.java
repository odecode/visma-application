public class LoginAction extends AbstractAction {
    public LoginAction(String src){
        super();
        this.source = src;
        this.action = this;
        this.actionName = "Login";
    }

    @Override
    public AbstractAction getAction(){
        return this.action;
    }

    public void doAction(){
       
        System.out.println("Logging in "+this.source);

    }



}