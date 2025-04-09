package com.bridgelabz.AdvancedProblems.ConvertObjects;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.util.List;

public class ConvertJavaObjects {

    public static class Student {
        @CsvBindByName(column = "ID")
        private int id;

        @CsvBindByName(column = "Name")
        private String name;

        @CsvBindByName(column = "Age")
        private String age;

        @CsvBindByName(column = "Grade")
        private String grade;

        public int getId() { return id; }
        public void setId(int id) { this.id = id; }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public String getAge() { return age; }
        public void setAge(String email) { this.age = email; }

        public String getGrade() { return grade; }
        public void setGrade(String grade) { this.grade = grade; }

        @Override
        public String toString() {
            return "Student [ID=" + id + ", Name=" + name + ", Age=" + age + ", Grade=" + grade + "]";
        }
    }
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("C:\\Users\\sehajpreet\\Desktop\\bridgelabz-workspace\\java-csv\\src\\main\\java\\com\\bridgelabz\\AdvancedProblems\\ConvertObjects\\students.csv");

            CsvToBean<Student> csvToBean = new CsvToBeanBuilder<Student>(reader)
                    .withType(Student.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            List<Student> students = csvToBean.parse();

            System.out.println("List of Students:");
            for (Student s : students) {
                System.out.println(s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
/*
List of Students:
Student [ID=1000, Name= Sehaj, Age= 22, Grade= O]
Student [ID=1001, Name= Sanya, Age= 21, Grade= A+]
Student [ID=1002, Name= Bhawishya, Age= 22, Grade= A]
Student [ID=1003, Name= Ankush, Age= 18, Grade= B]
Student [ID=1004, Name= Dikshit, Age= 16, Grade= C]
 */