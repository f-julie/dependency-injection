package com.bloomtech.dependencyinjection.models;

public class Company {
    private String name;
    public Company() {
    }
    public Company(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
