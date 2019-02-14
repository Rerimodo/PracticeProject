package base.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users")
public class User implements Serializable {


        @Id
        @GeneratedValue
        @Column(name = "id")
        private int id;

        @Column(name = "login", nullable = false, unique = true)
        private String login;

        @Column(name = "password", nullable = false)
        private String password;

        @Column(name = "email", nullable = false, unique = true)
        private String email;

        @Column(name = "telegram")
        private Integer telegram;



        protected User() {}

        public User(String login, String password, String email) {
            this.login = login;
            this.password = password;
            this.email = email;
        }



        public int getID () { return this.id; }

        public String getLogin(){
        return this.login;
    }

        public String getPassword(){
        return this.password;
    }

        public String getEmail() {
        return this.email;
    }

        public Integer getTelegram() {
        return this.telegram;
    }

        public void setLogin(String login){
            this.login = login;
    }

        public void setPassword(String password){
            this.password = password;
    }

        public void setEmail(String email){
            this.email = email;
    }

        public void setTelegram(Integer telegram){
        this.telegram = telegram;
    }

}