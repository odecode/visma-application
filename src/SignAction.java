import java.util.UUID;

public class SignAction extends AbstractAction {

    private UUID documentId;
    public SignAction(String src,String docId){
        super();
        this.source = src;
        this.parameter = docId;
        this.action = this;
        this.actionName = "Sign";
        this.documentId = parseParam(docId);
    }

    public AbstractAction getAction(){
        return this.action;
    }

    private UUID parseParam(String docID){
        int cutoff = docID.indexOf("=")+1;
        String uuidString = docID.substring(cutoff);
        UUID actualID = UUID.fromString(uuidString);
        return actualID;
    }


    @Override
    public void doAction() {
        System.out.println("Signing " +this.source +" with document ID "  +this.documentId.toString());
        
    }
    
}
