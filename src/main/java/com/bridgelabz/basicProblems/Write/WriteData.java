package com.bridgelabz.basicProblems.Write;

import java.io.*;

public class WriteData {
    public static void main(String[] args){
        String filePath="C:/Users/sehajpreet/Desktop/bridgelabz-workspace/java-csv/src/main/java/com/bridgelabz/basicProblems/Write/write.csv";
        try(BufferedWriter br= new BufferedWriter(new FileWriter(filePath))){
            br.write("ID, Name, Department, Salary\n");
            br.write("100, Sehaj, It, 88000\n");
            br.write("101, Bhawishya, Cloud, 80000\n");
            br.write("102, Sanya, It, 78000\n");
            br.write("103, Dikshit, Hr, 76000\n");
            br.write("104, Dhruv, Client Interaction, 56000\n");

            System.out.println("CSV file written successfully!");

        }
        catch (IOException e){
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
/*
CSV file written successfully!
 */
