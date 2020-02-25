package edu.fengli.demo2;

import java.util.Scanner;

public class test1102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Student[] students = new Student[n];

        for (int i = 0 ;i < n;i++){
            String[] s = scanner.nextLine().split(" ");
            Student student = new Student(s[0], s[1], Integer.parseInt(s[2]),Integer.parseInt(s[3]));
            students[i] = student;
        }
        for (int i = 0 ; i < students.length - 1; i++){
            for (int j = 0; j < students.length - 1 - i; j++){
                if (students[j].getGrade() > students[j + 1].getGrade()){
                    Student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }

        for (Student student : students){
            System.out.println(student);
        }
    }
}

class Student{
    private String name;
    private String six;
    private Integer age;
    private Integer grade;

    public Student(String name, String six, Integer age, Integer grade) {
        this.name = name;
        this.six = six;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSix() {
        return six;
    }

    public void setSix(String six) {
        this.six = six;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return this.name + " " + this.six + " "
                + this.age + " " + this.grade;
    }
}
