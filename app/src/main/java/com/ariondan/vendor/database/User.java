package com.ariondan.vendor.database;

/**
 * Created by USER on 7/17/2017.
 */

class User {

    private int id;
    private String email;
    private String password;

    User(int id, String email, String password) {
        setId(id);
        setEmail(email);
        setPassword(password);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

