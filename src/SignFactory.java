import java.util.ArrayList;

public class SignFactory extends AbstractFactory {

    public SignFactory(){
        super();
    }

    @Override
    public AbstractAction createAction(ArrayList<String> param) {

        String src = param.get(1);
        String parameter = param.get(2);
        AbstractAction sign = new SignAction(src,parameter);
        return sign;
    }
    
}
