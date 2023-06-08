package com.sat.result.services;


import com.sat.result.models.SATResult;

import java.util.Map;
import java.util.Scanner;

public class Update {
    public static void updateScore(Map<String, SATResult> resultsMap,Scanner scanner) {
        System.out.println("----- Update Score -----");
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        if (resultsMap.containsKey(name)) {
            System.out.print("Enter new SAT Score: ");
            int satScore = scanner.nextInt();
            scanner.nextLine();

            boolean passed = satScore > 0.3*1600;

            SATResult result = resultsMap.get(name);
            result.setSatScore(satScore);
            result.setPassed(passed);

            System.out.println("Score updated successfully for " + name);
        } else {
            System.out.println("No record found for " + name);
        }
    }
}
