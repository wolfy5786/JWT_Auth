package com.example.authentication.DTO;

public class AuthResponce {
    private String token;
    private String username;

    public AuthResponce(String token, String username) {
        this.token = token;
        this.username = username;
    }

    public String getToken() {
        return token;
    }

    public String getUsername() {
        return username;
    }
}
