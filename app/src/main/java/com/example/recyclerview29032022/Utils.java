package com.example.recyclerview29032022;

import java.util.Date;

public class Utils {
    public Utils(int hours){
        Date date = new Date();
        date.setTime(hours*1000);
    }
}
