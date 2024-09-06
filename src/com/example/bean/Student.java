package com.example.bean;

import java.util.Objects;

public class Student {
    private String name;
    private int rollno;
    private String email;
    private String mobile;
    private int rank;

    public Student() {
    }

    public Student(String name, int rollno, String email, String mobile, int rank) {
        this.name = name;
        this.rollno = rollno;
        this.email = email;
        this.mobile = mobile;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollno == student.rollno && rank == student.rank && Objects.equals(name, student.name) && Objects.equals(email, student.email) && Objects.equals(mobile, student.mobile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollno, email, mobile, rank);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", rank=" + rank +
                '}';
    }
}
