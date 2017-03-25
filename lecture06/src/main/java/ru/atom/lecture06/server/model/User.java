package ru.atom.lecture06.server.model;
import ru.atom.lecture06.server.dao.MessageDao;
/**
 * Created by sergey on 3/25/17.
 */
public class User {
    private int id;
    private String login;

    public int getId() {
        return id;
    }

    public User setId(int id) {
        this.id = id;
        return this;
    }

    public String getLogin() {
        return login;
    }

    public User setLogin(String login) {
        this.login = login;

        return this;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                '}';
    }
}
