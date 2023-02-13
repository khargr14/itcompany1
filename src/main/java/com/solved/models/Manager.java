package com.solved.models;

public class Manager extends Person {
    String moniterapplication;
    String SeniorManager;


    public Manager(String moniterapplication) {
        this.moniterapplication = moniterapplication;
    }


    public String getSeniorManager() {
        return SeniorManager;
    }

    public void setSeniorManager(String seniorManager) {
        SeniorManager = seniorManager;
    }



}
