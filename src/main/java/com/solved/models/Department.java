package com.solved.models;


import com.solved.enums.DepartementEnum;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Department  {

    private static final Logger logger = LogManager.getLogger(Department.class);

    public String departmentname;
    private int Totaldepartements;



    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    public int getDepatementmember() {
        return Totaldepartements;
    }

    public void setDepatementmember(int depatementmember) {
        this.Totaldepartements = depatementmember;
    }
    public static void showEmployeeDepartment(DepartementEnum department){

        switch (department){
            case ItOperation:{
                System.out.println("Employee Department is It Operations");
                break;
            }
            case HrEmploy:{
                System.out.println("Employee Department is It HrEmploy");
                break;
            }
            case QA:{
                System.out.println("Employee Department is It QA");
                break;
            }
        }

    }

    }


