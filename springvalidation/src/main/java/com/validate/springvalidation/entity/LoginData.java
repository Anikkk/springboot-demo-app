package com.validate.springvalidation.entity;

public class LoginData {
    private String userName;
    private String email;
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "FormData [email=" + email + ", userName=" + userName + "]";
    }
}
