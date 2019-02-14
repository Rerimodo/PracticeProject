package base.info;

import base.model.User;

public class UserInfo {

    public int id;
    public String login;
    public String password;
    public String email;
    public Integer telegram;

    private UserInfo(){}
    public UserInfo(User user){
        id = user.getID();
        login = user.getLogin();
        password = user.getPassword();
        email = user.getEmail();
        telegram = user.getTelegram();
    }
}
