package edu.fengli.demo3;

import java.util.*;

/**
 * @author Administrator
 */
public class T551 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        Student[] students = new Student[count];
        int index = 0;
        while (count > 0){
            String[] s = scanner.nextLine().split(" ");
            Student student = new Student(s[0], Integer.parseInt(s[1]));
            students[index ++] = student;
            count --;
        }

        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].score < students[j].score){
                    int temp = students[i].score;
                    students[i].score = students[j].score;
                    students[j].score = temp;
                }

                if (students[i].score == students[j].score){
                    String nameI = students[i].name;
                    String nameJ = students[j].name;
                    char[] charsI = nameI.toCharArray();
                    char[] charsJ = nameJ.toCharArray();

                }
            }
        }
        System.out.println(Arrays.toString(students));
    }
    static class Student{
        private String name;
        private int score;

        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }
        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", score=" + score +
                    '}';
        }
    }
}
