package Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dialogue {

    public Dialogue() {

    }

    public Dialogue(Long creatorsId, String membersId, String msgId) {
        this.creatorsId = creatorsId;
        this.membersId = membersId;
        this.msgId = msgId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public Long creatorsId;

    public String membersId, msgId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreatorsId() {
        return creatorsId;
    }

    public void setCreatorsId(Long creatorsId) {
        this.creatorsId = creatorsId;
    }

    public String getMembersId() {
        return membersId;
    }

    public void setMembersId(String membersId) {
        this.membersId = membersId;
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }
}
