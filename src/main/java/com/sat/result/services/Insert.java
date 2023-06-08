package com.sat.result.services;


import com.sat.result.models.SATResult;


import java.util.Map;
import java.util.Scanner;

public class Insert {
    public  static void insertData(Map<String, SATResult> resultsMap,Scanner scanner) {
        boolean flag = false;
        do {
            try {
                System.out.println("----- Insert Data -----");
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
               // System.out.println(resultsMap.keySet());
                if (resultsMap.containsKey(name)) {
                    System.out.println("This Name Already exist!.");
                } else {
                    System.out.print("Enter Address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter City: ");
                    String city = scanner.nextLine();
                    System.out.print("Enter Country: ");
                    String country = scanner.nextLine();
                    System.out.print("Enter Pincode: ");
                    String pincode = scanner.nextLine();
                    System.out.print("Enter SAT Score: ");
                    int satScore = scanner.nextInt();
                    scanner.nextLine();

                    boolean passed = satScore > 0.3*1600;


                    SATResult result = new SATResult(name, address, city, country, pincode, satScore, passed);
                    resultsMap.put(name, result);

                    System.out.println("Data inserted successfully!");
                }
            }
            catch (NumberFormatException e) {
                flag=true;
                    System.out.println("Invalid input Format.Enter Again!");
                }

        }while(flag==true);
    }
}
