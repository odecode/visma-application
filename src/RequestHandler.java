import java.util.ArrayList;

class RequestHandler{
    public RequestHandler(){

    }


    public ArrayList<String> parse(String input){
        ArrayList<String> outputTemp = new ArrayList<String>();

        int indexOfCol = input.indexOf(":");

        String identitySubstr = input.substring(0, indexOfCol);
        if(!identitySubstr.equals("visma-identity")){
            System.out.println("Bad identity: "+identitySubstr);
            return null;
        }
        System.out.println("Identity confirmed");

        int indexOfActionFirstChar = indexOfCol+3;
        int indexOfActionLastChar = input.indexOf("?");
        String actionSubstr = input.substring(indexOfActionFirstChar, indexOfActionLastChar);
        
        if(!actionSubstr.equals("login") && !actionSubstr.equals("confirm")  && !actionSubstr.equals("sign") ){
            System.out.println("Bad action: "+actionSubstr);
            return null;
        }

        outputTemp.add(actionSubstr);

        if(actionSubstr.equals("login")){
            int indexOfSource = indexOfActionLastChar+1;
            String source = input.substring(indexOfSource);
            if(!source.contains("source=")){
                System.out.println("Bad source: "+source);
                return null;
            }
            outputTemp.add(source);
            return outputTemp;
        }

        int indexOfFirstParamFirstChar = indexOfActionLastChar+1;
        int indexOfFirstParamLastChar = input.indexOf("&");

        String firstParam = input.substring(indexOfFirstParamFirstChar,indexOfFirstParamLastChar);

        if(!firstParam.contains("source=")){
            System.out.println("Bad source: "+firstParam);
            return null;
        }
        outputTemp.add(firstParam);


        
        int paramFirstCharIndex = input.indexOf("&")+1;
        String paramLastPart = input.substring(paramFirstCharIndex);
        
        if(actionSubstr.equals("confirm") && !paramLastPart.contains("paymentnumber=")){
            System.out.println("Bad payment number parameter: "+paramLastPart);
            return null;
        }
        
        else if(actionSubstr.equals("sign") && !paramLastPart.contains("documentid=")){
            System.out.println("Bad document ID parameter: "+paramLastPart);
            return null;
        }
        outputTemp.add(paramLastPart);
       
        
        return outputTemp;

    }


}