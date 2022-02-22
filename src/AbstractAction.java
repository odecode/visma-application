public abstract class AbstractAction {
    String actionName;
    String source;
    String parameter;
    AbstractAction action;

    public String getActionName(){
        return this.actionName;
    }

    
    public AbstractAction getAction(){
        return this.action;
    }

    public abstract void doAction();

}
