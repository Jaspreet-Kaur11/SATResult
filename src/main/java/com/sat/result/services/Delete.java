package com.sat.result.services;

import com.sat.result.models.SATResult;

import java.util.Map;
import java.util.Scanner;

public class Delete {
    public static void deleteRecord(Map<String, SATResult> resultsMap,Scanner scanner) {
        System.out.println("----- Delete One Record -----");
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        if (resultsMap.containsKey(name)) {
            resultsMap.remove(name);
            System.out.println(name + "'s record has been deleted");
        } else {
            System.out.println("No record found for " + name);
        }
    }
}
