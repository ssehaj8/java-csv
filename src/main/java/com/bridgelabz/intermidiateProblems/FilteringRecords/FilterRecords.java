package com.bridgelabz.intermidiateProblems.FilteringRecords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilterRecords {
    public static void main(String[] args) {
        String filepath = "C:/Users/sehajpreet/Desktop/bridgelabz-workspace/java-csv/src/main/java/com/bridgelabz/intermidiateProblems/FilteringRecords/students.csv";
        try ( BufferedReader br = new BufferedReader(new FileReader(filepath))) {

            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] coloumns=line.split(",");
                int marks=  Integer.parseInt(coloumns[3].trim());

                if(marks>80){
                    System.out.println("Id: "+ coloumns[0]);
                    System.out.println("Name: "+coloumns[1]);
                    System.out.println("Age: "+coloumns[2]);
                    System.out.println("marks: "+coloumns[3]);
                    System.out.println(" ");
                }

            }
        }
        catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid marks value in file.");
        }
    }
}
/*
Id: 101
Name: Sehaj
Age: 22
marks: 98

Id: 102
Name: Bhawishya
Age: 21
marks: 92

Id: 104
Name: Dikshit
Age: 22
marks: 88

Id: 105
Name: Aakanksh
Age: 20
marks: 91

Id: 107
Name: Aryav
Age: 21
marks: 81
 */