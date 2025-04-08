package com.bridgelabz.basicProblems.CountRows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountRows {
    public static void main(String[] args){
        String filepath="C:/Users/sehajpreet/Desktop/bridgelabz-workspace/java-csv/src/main/java/com/bridgelabz/basicProblems/CountRows/records.csv";
        int count=0;
        try(BufferedReader br= new BufferedReader(new FileReader(filepath))){
            String line;
            br.readLine();
            while((line = br.readLine()) != null){
                count++;
            }
            System.out.println("Number of rows: "+count);
        }
        catch(IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
/*
Number of rows: 7
 */