import java.util.ArrayList;

public class LoginFactory extends AbstractFactory{
    
    public LoginFactory(){
        super();
    }


    public AbstractAction createAction(ArrayList<String> param){
        String loginSrc = param.get(1);
        AbstractAction login = new LoginAction(loginSrc);
        return login;
    }
}
