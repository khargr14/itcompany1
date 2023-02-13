package com.solved.models;

import com.solved.enums.Salery;

public class Employee extends Developer{
  public String JuniorDeveloper;


    public String SeniorDeveloper;

    public String salery;
    public static void salery(Salery salery)
    {
        switch (salery)
        {
            case LacDollars:
            {
                System.out.println("Your salery is oneLac Dollar");
            }
            case Hundereddollar:
            {
                System.out.println("Your salery is Hundered Dollar");
            }
        }}
        public String getJuniorDeveloper() {
        return JuniorDeveloper;
    }

        public void setJuniorDeveloper(String juniorDeveloper) {
        JuniorDeveloper = juniorDeveloper;
    }

        public String getSeniorDeveloper() {
        return SeniorDeveloper;
    }

        public void setSeniorDeveloper(String seniorDeveloper) {
        SeniorDeveloper = seniorDeveloper;
    }



    }


