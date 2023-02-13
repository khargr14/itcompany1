package com.solved.models;

import com.solved.interfaces.InteDepartement;

public class Developer extends Person implements InteDepartement {
    private String Frontend;
    private String backend;
    private String Seniordeveloper;
    private String Juniordeveloper;

    private double basicsalery;
    public double getBasicsalery(){return basicsalery; }
    public void setBasicsalery(double basicsalery) {
        this.basicsalery = basicsalery;
    }

    public static   void showDeveloperType(com.solved.enums.Qualification developer){
switch(developer)
{
    case SeniorDeveloper:
        System.out.println("This is Senior Developer");
    case JuniorDeveloper:
        System.out.println("This is jUNIOR DEVELOPER");
}

        }


    @Override
    public String departementname(String name) {
        return"Developer";
    }
}










