package com.rwt.blogusermanage.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * @author 10156610c
 * @date
 */
@Entity

public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String username;
    private String password;
    private String mobliephone;
    private String email;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Role> roleSet;

    private boolean state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobliephone() {
        return mobliephone;
    }

    public void setMobliephone(String mobliephone) {
        this.mobliephone = mobliephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Role> getRoleSet() {
        return roleSet;
    }

    public void setRoleSet(Set<Role> roleSet) {
        this.roleSet = roleSet;
    }
    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
