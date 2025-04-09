package com.bridgelabz.AdvancedProblems.ValidatingData;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.regex.Pattern;

public class ValidateData {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\sehajpreet\\Desktop\\bridgelabz-workspace\\java-csv\\src\\main\\java\\com\\bridgelabz\\AdvancedProblems\\ValidatingData\\students.csv";

        Pattern emailPattern = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");

        Pattern phonePattern = Pattern.compile("^\\d{10}$");

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] header = reader.readNext();
            String[] row;
            int rowNumber = 2;

            while ((row = reader.readNext()) != null) {
                String name = row[0];
                String email = row[1];
                String phone = row[2];

                boolean isValid = true;

                if (!emailPattern.matcher(email).matches()) {
                    System.out.println("Row " + rowNumber + ": Invalid email → " + email);
                    isValid = false;
                }

                if (!phonePattern.matcher(phone).matches()) {
                    System.out.println("Row " + rowNumber + ": Invalid phone number → " + phone);
                    isValid = false;
                }

                if (isValid) {
                    System.out.println("Row " + rowNumber + ": Valid");
                }

                rowNumber++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

