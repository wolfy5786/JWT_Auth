package com.example.authentication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_credentials")
public class User {
    private String username;
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    public User(String username, String password, Role role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public User() { //required by JPA
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }
    public static class Builder
    {
        private String username;
        private String password;
        private Role role;

        public Builder username(String username)
        {
            this.username = username;
            return this;
        }

        public Builder password(String password)
        {
            this.password = password;
            return this;
        }

        public Builder role(Role role)
        {
            this.role = role;
            return this;
        }
        public User build()
        {
            return new User(username, password, role);
        }
    }
}
