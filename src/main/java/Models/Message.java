package Models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Message {

    public Message() {

    }

    public Message(Long senderId, Long dialogueId, String text, String imgLink) {
        this.senderId = senderId;
        this.dialogueId = dialogueId;
        this.text = text;
        this.imgLink = imgLink;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public Long senderId, dialogueId;

    public String text, imgLink;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSenderId() {
        return senderId;
    }

    public void setSenderId(Long senderId) {
        this.senderId = senderId;
    }

    public Long getDialogueId() {
        return dialogueId;
    }

    public void setDialogueId(Long dialogueId) {
        this.dialogueId = dialogueId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImgLink() {
        return imgLink;
    }

    public void setImgLink(String imgLink) {
        this.imgLink = imgLink;
    }
}
