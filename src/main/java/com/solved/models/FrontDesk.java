package com.solved.models;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FrontDesk extends Receptionist  {
    private static final Logger logger = LogManager.getLogger(FrontDesk.class);
 private String ClientName;



    public  String Deskhelp;

 private String ClientInformation;
    private int age;

    public String getClientName() {
        return ClientName;
    }

    public String getClientInformation() {
        return ClientInformation;
    }
    public String getDeskhelp() {
        return Deskhelp;
    }

    public void setDeskhelp(String deskhelp) {
        Deskhelp = deskhelp;
    }

    @Override
    public void run() {

    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }
}