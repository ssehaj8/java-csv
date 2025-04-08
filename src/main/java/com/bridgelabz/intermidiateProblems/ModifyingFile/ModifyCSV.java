package com.bridgelabz.intermidiateProblems.ModifyingFile;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.bean.*;
import java.io.*;
import java.util.List;

public class ModifyCSV {
    public static void main(String[] args) {
        String filepath="C:\\Users\\sehajpreet\\Desktop\\bridgelabz-workspace\\java-csv\\src\\main\\java\\com\\bridgelabz\\intermidiateProblems\\ModifyingFile\\employee.csv";
        String UpdatedFilePath="C:\\Users\\sehajpreet\\Desktop\\bridgelabz-workspace\\java-csv\\src\\main\\java\\com\\bridgelabz\\intermidiateProblems\\ModifyingFile\\updatedfile.csv";
        try(CSVReader reader = new CSVReader(new FileReader(filepath));
            CSVWriter writer = new CSVWriter(new FileWriter(UpdatedFilePath))){
            String[] header;
            header = reader.readNext();
            writer.writeNext(header);
            String[] read;
            while((read = reader.readNext())!=null){
                if(read[2].equals("IT")){
                    double salary = Double.parseDouble(read[3]);
                    salary = salary*1.10;
                    read[3] = String.valueOf(salary);
                }
                writer.writeNext(read);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}