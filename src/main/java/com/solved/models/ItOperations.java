package com.solved.models;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class ItOperations extends Project  {
//Generic Class
private static final Logger logger = LogManager.getLogger(ItOperations.class);

    private String personName;
    private int age;
    private  String  DeptName;
    private String itOperations;


    public static double Sum(List<? extends Number> list){
        double Sum = 0;
        for(Number n : list){
            Sum += n.doubleValue();
        }
        return Sum;
    }// attriutes inerited from DepartementEnum class

    public void DeptName() {
        logger.info(DeptName+"DepartementEnum Name");
    }
    public void Itoperaions()
    {
        logger.info("Itoperations");
    }


    @Override
    public void Adminsstaffsalary(int salary) {
        logger.info("Salery of Admin staff");
    }
}
