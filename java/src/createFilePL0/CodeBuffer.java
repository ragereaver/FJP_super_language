package createFilePL0;

/**
 * Created by BobrZlosyn on 17.12.2017.
 */
public class CodeBuffer {
    private StringBuilder code;

    public CodeBuffer(){
        code = new StringBuilder();
    }

    public void appendToBuffer(String toWrite){
        code.append(toWrite);
        code.append("\n");
    }

    public void eraseBuffer(){
        code.delete(0, length());
    }

    public int length() {
        return code.length();
    }

    public String getContent(){
        return code.toString();
    }
}
