package com.example.screamitus_android;

public class Infection {

    //test
    int day;
    int totalInfected;
    int noOfInfectedPerday;

    public int calculateTotalInfected(int day){


        totalInfected = day * noOfInfectedPerday;


        return totalInfected;
    }

}
