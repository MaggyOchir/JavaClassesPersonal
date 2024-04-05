package org.example.class14;

public class StudentsTester {
    public static void main(String[] args) {
        Students s1 = new Students();
        Students s2 = new Students();
        Students s3 = new Students();
        System.out.println(s1.numberOfStudents++);
        System.out.println(s1.numberOfStudents++);
        System.out.println(s1.numberOfStudents++);
        System.out.println(Students.numberOfStudents);
    }
}
