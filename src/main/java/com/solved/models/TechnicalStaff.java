package com.solved.models;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TechnicalStaff extends Department{
    private static final Logger logger = LogManager.getLogger(TechnicalStaff.class);

    private String personName;
    private int age;
    private String TechnicalStaff;

    private int Members;




    public void peronName()
 {
     logger.info(personName+"Name Of Person");
 }
    void Jrenge()
    {
      logger.info("This is polymorphism function extended tojreng");

    }

}
