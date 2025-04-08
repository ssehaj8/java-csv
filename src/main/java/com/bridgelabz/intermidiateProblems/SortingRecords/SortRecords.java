package com.bridgelabz.intermidiateProblems.SortingRecords;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.*;

public class SortRecords{
    public static void main(String[] args) {
        List<String[]> employees = new ArrayList<>();

        try(CSVReader reader  = new CSVReader(new FileReader("C:\\Users\\sehajpreet\\Desktop\\bridgelabz-workspace\\java-csv\\src\\main\\java\\com\\bridgelabz\\intermidiateProblems\\SortingRecords\\employee.csv"))){
            String[] header = reader.readNext();
            String[] line;
            while((line = reader.readNext())!=null){
                employees.add(line);
            }

            employees.sort((a,b) -> {
                double sal1 = Double.parseDouble(a[3]);
                double sal2 = Double.parseDouble(b[3]);
                return Double.compare(sal2,sal1);
            });

            for(int i=0;i<5;i++){
                String[] employee = employees.get(i);
                System.out.println("ID: "+employee[0]+", Name: "+employee[1]+", Department: "+employee[2]+", Salary: "+employee[3]);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
