package test.swipecards;


/**
 * Created by braj.kishore on 1/24/2016.
 */
public class ChatHistoryModel {

    private  String chatImg;
    private String chatUName,chatDate,chatLine;

    public String getJid() {
        return jid;
    }

    public void setJid(String jid) {
        this.jid = jid;
    }

    private String jid;

    public String getChatImg() {
        return chatImg;
    }

    public void setChatImg(String chatImg) {
        this.chatImg = chatImg;
    }

    public String getChatUName() {
        return chatUName;
    }

    public void setChatUName(String chatUName) {
        this.chatUName = chatUName;
    }

    public String getChatDate() {
        return chatDate;
    }

    public void setChatDate(String chatDate) {
        this.chatDate = chatDate;
    }

    public String getChatLine() {
        return chatLine;
    }

    public void setChatLine(String chatLine) {
        this.chatLine = chatLine;
    }
}
