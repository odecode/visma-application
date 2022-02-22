import java.util.ArrayList;

public class ConfirmFactory extends AbstractFactory {

    public ConfirmFactory(){
        super();
    }

    @Override
    public AbstractAction createAction(ArrayList<String> param) {
        String src = param.get(1);
        String parameter = param.get(2);
        AbstractAction confirm = new ConfirmAction(src,parameter);
        return confirm;
    }
    
}
