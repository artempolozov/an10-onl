package com.polozov.mainCourseJava.lesson06;

import java.util.Arrays;
import java.util.Objects;

public class User {
    long id;
    String username;
    String role;
    String[] access;
    String password;

    User() {
        this.access = new String[10];
        this.id = 1L;
    }

    User(long userId, String username, String userPassword) {
        this.id = userId;
        this.username = username;
        this.password = userPassword;
        this.role = "USER";
        this.access = new String[10];
    }

    public User(long id, String username, String role, String[] access, String password) {
        this.id = id;
        this.username = username;
        this.role = role;
        this.access = access;
        this.password = password;
    }

    public User(long id, String username, String role, String password) {
        this.id = id;
        this.username = username;
        this.role = role;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(username, user.username) && Objects.equals(role, user.role) && Arrays.equals(access, user.access) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, username, role, password);
        result = 31 * result + Arrays.hashCode(access);
        return result;
    }
}
