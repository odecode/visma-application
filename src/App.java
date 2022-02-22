import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter URI, or x to exit: "); // copy paste valid or invalid URIs to console, I tested with the ones provided in the email and modified them to be invalid
        String input = scan.nextLine();
        
        RequestHandler reqHand = new RequestHandler();
        
        AbstractFactory loginFac = new LoginFactory();
        AbstractFactory confFac = new ConfirmFactory();
        AbstractFactory signFac = new SignFactory();


        
        while(!input.equals("x")){
            
            ArrayList<String> parsedString =  reqHand.parse(input);
            if(parsedString != null){
                String action = parsedString.get(0);
                
                AbstractAction actionObject = null;

                if(action.equals("login")){
                    actionObject =  loginFac.createAction(parsedString);
                }
                else if(action.equals("confirm")){
                    actionObject = confFac.createAction(parsedString);
                }
                else if(action.equals("sign")){
                    actionObject = signFac.createAction(parsedString);
                }

                if(actionObject != null){
                    actionObject.doAction();
                }


            }
            System.out.print("Enter URI, or x to exit: ");
            input = scan.nextLine();
        }
        
        scan.close();
        System.out.println("Thank you and good bye");
    



    }
}
