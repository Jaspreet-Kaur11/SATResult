package com.sat.result.services;


import com.sat.result.models.SATResult;

import java.util.Map;
import java.util.Scanner;

public class GetRank {
    public static void getRank(Map<String, SATResult> resultsMap,Scanner scanner) {
        System.out.println("----- Get Rank -----");
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        if (resultsMap.containsKey(name)) {
            int rank = 1;
            int targetScore = resultsMap.get(name).getSatScore();

            for (SATResult result : resultsMap.values()) {
                if (result.getSatScore() > targetScore) {
                    rank++;
                }
            }

            System.out.println(name + " has a rank of " + rank);
        } else {
            System.out.println("No record found for " + name);
        }
    }
}
