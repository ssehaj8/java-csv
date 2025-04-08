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
                System.out.println("Name: "+columns[1]);
                System.out.println("Age: "+columns[2]);
                System.out.println("Marks: "+columns[3]);
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
Name: Sehaj
Age: 22
Marks: 98

ID: 102
Name: Bhawishya
Age: 21
Marks: 92

ID: 103
Name: Sanya
Age: 19
Marks: 78

ID: 104
Name: Dikshit
Age: 22
Marks: 88

ID: 105
Name: Aakanksh
Age: 20
Marks: 91

ID: 106
Name: Dhruv
Age:  20
Marks: 78

ID: 107
Name: Aryav
Age: 21
Marks: 81


*/