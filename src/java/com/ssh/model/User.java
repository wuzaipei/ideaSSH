package com.ssh.model;

import javax.persistence.*;

@Entity
@Table(name = "user", schema = "test", catalog = "")
public class User {
    private int id;
    private String uname;
    private String passwd;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "uname")
    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    @Basic
    @Column(name = "passwd")
    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        User that = (User) o;

        if (id != that.id) {
            return false;
        }
        if (uname != null ? !uname.equals(that.uname) : that.uname != null) {
            return false;
        }
        return passwd != null ? passwd.equals(that.passwd) : that.passwd == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (uname != null ? uname.hashCode() : 0);
        result = 31 * result + (passwd != null ? passwd.hashCode() : 0);
        return result;
    }
}
