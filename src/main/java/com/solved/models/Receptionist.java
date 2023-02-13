package com.solved.models;


import com.solved.interfaces.InteReceptionisData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Receptionist extends Person implements InteReceptionisData {
    private static final Logger logger = LogManager.getLogger(Receptionist.class);
    private int age;
    private String Receptionistname;


    public String getReceptionistname() {
        return Receptionistname;
    }

    public void setReceptionistname(String receptionistname) {
        Receptionistname = receptionistname;
    }


    void Reception()
    {
      logger.info("This is polymorphism extended from  Perosn class");

    }
    public int age()
    {
 logger.info("tHIS IS POLYMORISM From the Person class");
        return age;
    }


    @Override
    public void information(String Peroninfo) {
        logger.info("Here we will get the information of the Client");
    }

    // and here (or in any other method you create) you can use the fields:
    public abstract void run();


    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }
}
