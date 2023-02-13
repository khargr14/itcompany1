package com.solved.models;



public abstract class Person  {

    public String personName;
    public String posticompany;
    private int age;
    private static String Qualification;
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }




}



