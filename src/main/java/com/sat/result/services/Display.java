package com.sat.result.services;


import com.sat.result.models.SATResult;

import java.util.Map;

public class Display {

    public static void viewAllData(Map<String, SATResult> resultsMap) {
        System.out.println("----- View All Data -----");
        for (SATResult result : resultsMap.values()) {
            System.out.println(result.toJson());
        }
    }
}
