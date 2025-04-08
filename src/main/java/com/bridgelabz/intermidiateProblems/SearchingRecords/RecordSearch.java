package com.bridgelabz.intermidiateProblems.SearchingRecords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RecordSearch {
    public static void main(String[] args) {
        String filepath = "C:/Users/sehajpreet/Desktop/bridgelabz-workspace/java-csv/src/main/java/com/bridgelabz/intermidiateProblems/SearchingRecords/employee.csv";
        String SearchName = "Sehaj";
        boolean find = false;
        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] columns = line.split(",");

                if (columns[1].trim().equalsIgnoreCase(SearchName)) {
                    System.out.println("Employee Found!");
                    System.out.println("Department: " + columns[2]);
                    System.out.println("Salary    : " + columns[3]);
                    find = true;
                    break;
                }
            }
            if (!find) {
                System.out.println("Employee not found");
            }

        }
        catch(IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

/*
Employee Found!
Department:  It
Salary    :  88000
 */