package com.sat.result.services;
import com.sat.result.models.SATResult;
import com.sat.result.utils.Prompt;

import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;

public class Input {

public static void takeInput(){
    Prompt prompt = new Prompt();
    Insert insert = new Insert();
    Display display = new Display();
    GetRank rank = new GetRank();
    Update  update = new Update();
    Delete delete = new Delete();
    Scanner scanner = new Scanner(System.in);
    int choice;
     final Map<String, SATResult> resultsMap = new HashMap<>();
     boolean flag=false;

             do {
                     prompt.displayMenu();
                     choice = scanner.nextInt();
                     scanner.nextLine();
                 switch (choice) {
                     case 1:
                         insert.insertData(resultsMap, scanner);
                         break;
                     case 2:
                         display.viewAllData(resultsMap);
                         break;
                     case 3:
                         rank.getRank(resultsMap, scanner);
                         break;
                     case 4:
                         update.updateScore(resultsMap, scanner);
                         break;
                     case 5:
                         delete.deleteRecord(resultsMap, scanner);
                         break;
                     case 6:
                         flag=false;
                         System.out.println("Exiting the application. Goodbye!");
                         break;
                     default:
                         System.out.println("Invalid choice. Please try again.");
                 }
             } while (choice != 6);


}
}
