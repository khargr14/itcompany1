package com.solved.models;

import com.solved.interfaces.InteStaffName;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class JrEng extends TechnicalStaff implements InteStaffName {
    private static final Logger logger = LogManager.getLogger(JrEng.class);



    private String personName;
    private int idNo;
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getIdNo() {
        return idNo;
    }

    public void setIdNo(int idNo) {
        this.idNo = idNo;
    }


    public String toString() {
        String data = "Name : "+ getPersonName()+"\n"+"Age : "+ getIdNo()+"\n"+"Employee No :"+idNo;

        return data;
    }

    void Jrenge()
    {
        logger.info("This is polymorphism extended from TechnicalStaff class");

    }

    @Override
    public void name(String name) {
        logger.info("This is interface name intestaffname");
    }

}