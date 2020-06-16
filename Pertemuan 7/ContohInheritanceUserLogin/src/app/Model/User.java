package app.Model;

import java.util.Date;

public class User {
    private String username,password;
    private Date tglJoin;
    public User(){
        username="";
        password="";
        tglJoin= new Date();
    }
    public User(String username, String password, Date tglJoin) {
        this.username = username;
        this.password = password;
        this.tglJoin = tglJoin;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getTglJoin() {
        return this.tglJoin;
    }

    public void setTglJoin(Date tglJoin) {
        this.tglJoin = tglJoin;
    }

    public void cetakDataUser(){
        System.out.println("Username : "+getUsername()+"\n"
                            +"Password : "+getPassword()+"\n"
                            + "Tgl. Join : "+getTglJoin().toString()+"");
    }

}