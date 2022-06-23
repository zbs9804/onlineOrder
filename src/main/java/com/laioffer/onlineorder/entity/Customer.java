package com.laioffer.onlineorder.entity;
//POJO class例子：没有任何逻辑功能，仅仅为了hold数据的class，
//比如username，password
//以后所有的POJO class都应该放到entity包里，方便解耦合
public class Customer {
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private boolean enabled;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getEmail() {
        return email;
    }
}
