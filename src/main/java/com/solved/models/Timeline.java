package com.solved.models;

import com.solved.interfaces.InteAdminStaffSalery;


public class Timeline extends Project implements InteAdminStaffSalery {
    private String personName;
    private int salary;



    private int time;
    private  int cost;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public void Adminsstaffsalary(int salary) {//   Two Functions by polymorphism
        this.salary = salary;
    }


    @Override
    public int salery(int salery) {
        return salery;
    }
}