package com.loong;

public class StudentTest {

    public static void setStudent(Student student){
        student.setAge(5);
        student.setName("小明");
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(4);
        student.setName("小花");
        Student student1 = student;
        setStudent(student);
        System.out.println(student.toString());
        System.out.println(student1.toString());
    }
}
