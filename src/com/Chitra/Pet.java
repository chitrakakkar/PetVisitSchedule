package com.Chitra;

import java.time.DayOfWeek;
import java.util.*;

public class Pet
{

    String Name;
    String Type;
    String Address;
    HashMap<String,Integer> Frequency;
    List<String> Days;

    Pet(String name, String type, String address)
    {
        this.Name = name;
        this.Type = type;
        this.Address = address;
    }

//    void AddDaysInWeek(String DayName)
//    {
//        if(Days == null)
//        {
//           Days = new ArrayList<String>();
//        }
//        Days.add(DayName);
//    }

    void AddFrequency(HashMap<String,Integer> Freq)
    {
        if(Frequency == null)
        {

            Frequency = new HashMap<String, Integer>();
        }
        for (String key:Freq.keySet()
             )
        {
            Frequency.put(key,Freq.get(key));
        }
        System.out.println(this.Name);
        System.out.println(this.Type);
        System.out.println(this.Address);
//        for (String st:this.Days
//                )
//        {
//            System.out.println(st);
//        }

        System.out.println("Number of times in a week" + Frequency);
        System.out.println("****************************************************");
    }
}
