package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarRentalService {

    List<String> cars = new ArrayList<>(Arrays.asList(
            "Honda Accord",
            "Chevy Cruze",
            "Toyota Corolla"
    ));

    public void run(){
        int i = 1;
        System.out.println("Available Cars:");
        for(String car : cars){
            System.out.println(i++ +") " + car);
//            i++
        }

    }
}
