package com.solved.models;



import com.solved.interfaces.InteQualityAssurance;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class QA extends Department implements InteQualityAssurance {
    private static final Logger logger = LogManager.getLogger(QA.class);

    private String personName;
private String age;
private String operation;


    public void Itoperaions()
    {
        logger.info("This is polymorphism by the Itoperationclass");
    }



    @Override
    public String Qualtycheck(String qualitycheck) {
        return null;
    }

    @Override
    public int numberofProblems(int problems) {
        return problems;
    }
}

