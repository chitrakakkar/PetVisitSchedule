package com.Chitra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by chitrakakkar on 3/13/16.
 */
public class PetManager
{
    List<Pet> pets = new ArrayList<>();


    public static void main(String args[])
    {
        HashMap<String,Integer> info = new HashMap<>();
        Pet Pet1 = new Pet ("Molly","Cat","110 E 18th street ");

       info.put("Monday",2);
        info.put("Tuesday",1);
        info.put("Wednesday",2);
        Pet1.AddFrequency(info);
        Pet Pet2 = new Pet("Nina","Dog","407 7th street SE");
        info.put("Tuesday",3);
        info.put("Thursday",4);
        info.put("Fridat",2);
        Pet2.AddFrequency(info);

    }


}




