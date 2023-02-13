package com.solved.models;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Leads extends Person{

    private static final Logger logger = LogManager.getLogger(Leads.class);

    //This is the class which is extended from the Person which is abstract class
     private String name;

    public Leads(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void name(){
  logger.info("POLYORPHISM FROM THE person class");;

}

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

}