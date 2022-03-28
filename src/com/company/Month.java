package com.company;

import java.util.HashMap;

public class Month {
    //Gospade kakoj nuzhnyj klass.
    //Kak zhe ya lyublyu OOP...
    public String nameOfMonth;
    public  int dayOfMonth;
    public Month(String mnth, int day){
        dayOfMonth = day;
        nameOfMonth = mnth;
    }
    public Month(){

    }

//    public String toString(){
//
//        return nameOfMonth + " " + dayOfMonth  + "\n";
//    }
    public boolean equals(Month o){
        return this.nameOfMonth.equals(o.nameOfMonth);
    }

}
