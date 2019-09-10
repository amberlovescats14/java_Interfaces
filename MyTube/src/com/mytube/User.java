package com.mytube;

public class User {
    private String email;

    public User(String email) {
        this.email = email;
    }

    private String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }
}
