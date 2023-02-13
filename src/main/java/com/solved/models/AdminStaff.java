package com.solved.models;


import com.solved.interfaces.InteAdminStaffSalery;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AdminStaff extends Department implements InteAdminStaffSalery {

    private static final Logger logger = LogManager.getLogger(AdminStaff.class);
   ;
    private String managementpolicies;
    private String Requirementsupport;

    public AdminStaff(String requirementsupport) {
        Requirementsupport = requirementsupport;
        System.out.println("Re"+Requirementsupport);
    }


    public String getManagementpolicies() {
        return managementpolicies;
    }


    public void setManagementpolicies(String personName) {
        this.managementpolicies = managementpolicies;
    }


    @Override
    public int salery(int salery) {
        return 0;
    }
}