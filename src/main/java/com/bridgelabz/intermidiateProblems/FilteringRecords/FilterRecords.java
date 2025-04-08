package com.bridgelabz.intermidiateProblems.FilteringRecords;

import java.io.BufferedReader;
import java.io.FileReader;

public class FilterRecords {
    public static void main(String[] args) {
        String filepath = "C:/Users/sehajpreet/Desktop/bridgelabz-workspace/java-csv/src/main/java/com/bridgelabz/intermidiateProblems/FilteringRecords/students.csv";
        try ( BufferedReader br = new BufferedReader(new FileReader(filepath))) {

            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] coloumns=line.split(",");




            }
        }
    }
}