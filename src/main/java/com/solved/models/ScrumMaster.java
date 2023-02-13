package com.solved.models;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ScrumMaster extends Person  {
    private static final Logger logger = LogManager.getLogger(ScrumMaster.class);

    public ScrumMaster(String personName) {
        this.personName = personName;
    }


    private String Companygoals;

    private String objectives;


    public String getCompanygoals() {
        return Companygoals;
    }

    public void setCompanygoals(String companygoals) {
        Companygoals = companygoals;
    }
    public String getObjectives() {
        return objectives;
    }

    public void setObjectives(String objectives) {
        this.objectives = objectives;
    }




    void AdminStaffSalery()
    {
       logger.info("This is an interface ");

    }
}

