package com.solved.models;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class HrEmployee extends Department {
    private static final Logger logger = LogManager.getLogger(HrEmployee.class);


private int employeeNo;
private String departmentName;
private String joiningDate;

private Float salary;
private int bonus;


    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(int employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    public enum Salery {
        Hudered, Thousands,Lacs;


        public void displaysalaery() {
            logger.info("The name is " + this);
        }
    }





}