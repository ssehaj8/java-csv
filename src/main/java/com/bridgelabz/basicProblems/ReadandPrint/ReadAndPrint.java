package com.bridgelabz.basicProblems.ReadandPrint;
import  java.util.*;
import java.lang.*;
import java.io.*;
public class ReadAndPrint {
    public static void main(String[] args){
        String filePath = "C:/Users/sehajpreet/Desktop/bridgelabz-workspace/java-csv/src/main/java/com/bridgelabz/basicProblems/ReadandPrint/students.csv";

        try(BufferedReader br= new BufferedReader(new FileReader(filePath))){
           String line; //reads each line

           line= br.readLine();// this helps to skip the header line

            while((line=br.readLine())!= null){
                String[] columns= line.split(",");
                
                System.out.println("ID: "+columns[0]);
                System.out.println("Name: "+columns[0]);
                System.out.println("Age: "+columns[0]);
                System.out.println("Marks: "+columns[0]);
                System.out.println(" "); //give space
            }

        }
        catch (IOException e){
            System.out.println("Error reading the file: "+e.getMessage());
        }
    }
}
/*
ID: 101
Name: 101
Age: 101
Marks: 101

ID: 102
Name: 102
Age: 102
Marks: 102

ID: 103
Name: 103
Age: 103
Marks: 103

ID: 104
Name: 104
Age: 104
Marks: 104

ID: 105
Name: 105
Age: 105
Marks: 105

ID: 106
Name: 106
Age: 106
Marks: 106

ID: 107
Name: 107
Age: 107
Marks: 107

 */