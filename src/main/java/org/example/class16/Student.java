package org.example.class16;

public class Student {
    private String name;
    private int grade1;
    private int grade2;
    private int grade3;
    public Student(String eName, int eGrade1, int eGrade2, int eGrade3) {
        name = eName;
        grade1 = eGrade1;
        grade2 = eGrade2;
        grade3 = eGrade3;
    }

    public double average() {
        return (grade1 + grade2 + grade3) / 3;
    }
    public static void main(String[] args) {

        Student first = new Student("Maggy", 10, 20, 30);
        Student second = new Student("Asghar", 11, 22, 33);
        System.out.println(first.name + "'s" + " average grade is " + first.average());
        System.out.println(second.name + "'s" + " average grade is " + second.average());
    }
}
