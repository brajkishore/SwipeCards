package test.swipecards;

/**
 * Created by braj.kishore on 1/24/2016.
 */
public class InviteUserModel {

    private String fromJid;

    public String getInviteDate() {
        return inviteDate;
    }

    public void setInviteDate(String inviteDate) {
        this.inviteDate = inviteDate;
    }

    private String inviteDate;

    public String getFromJid() {
        return fromJid;
    }

    public void setFromJid(String fromJid) {
        this.fromJid = fromJid;
    }

    public String getUserDisplayName() {
        return userDisplayName;
    }

    public void setUserDisplayName(String userDisplayName) {
        this.userDisplayName = userDisplayName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getToJid() {
        return toJid;
    }

    public void setToJid(String toJid) {
        this.toJid = toJid;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    private String userDisplayName;
    private String message;
    private String toJid;
    private String image;
}
