package com.solved.models;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Project {
    private static final Logger logger = LogManager.getLogger(Project.class);

    private String projectName;
    private String projectType;

    public String getProjectName() {
        return projectName;
    }

    private int projectcost;

    public void name() {
        logger.info("Kay");
        ;
        logger.info("This is the polymorism inherited from Person cLASS");
    }

    public abstract void Adminsstaffsalary(int salary);


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
