package com.vetias.java.workshop.basics;

import java.time.LocalTime;

public class RegistrationTimeLeft {
    public static void main(String[] args) {
        LocalTime currenttime=LocalTime.now();
        LocalTime registrationendtime=LocalTime.of(18, 59, 59);
        int hoursleft=registrationendtime.getHour()-currenttime.getHour();
        int minleft=registrationendtime.getMinute()-currenttime.getMinute();
        int secondleft=registrationendtime.getSecond()-currenttime.getSecond();
        System.out.println("you have "+hoursleft+"hours "+minleft+"minutes "+secondleft+"seconds left");

    }}
    

