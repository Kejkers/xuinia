package Models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    public User(){

    }

    public User(String nickname, String password, String email, String name, String surname, String friends, String dialogues, boolean isOnline, boolean isActivated) {
        this.nickname = nickname;
        this.password = password;
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.friends = friends;
        this.dialogues = dialogues;
        this.isOnline = isOnline;
        this.isActivated = isActivated;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nickname, password, email, name, surname, friends, dialogues;

    private boolean isOnline, isActivated;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFriends() {
        return friends;
    }

    public void setFriends(String friends) {
        this.friends = friends;
    }

    public String getDialogues() {
        return dialogues;
    }

    public void setDialogues(String dialogues) {
        this.dialogues = dialogues;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    public boolean isActivated() {
        return isActivated;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }
}
