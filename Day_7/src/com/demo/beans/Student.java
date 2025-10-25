package com.demo.beans;

import java.io.Serializable;

import com.demo.exceptions.LowAttendance;

public class Student implements Serializable {
    // rollno, sname, course, attendance_percentage, score

    private int rollno;
    private String sname;
    private String course;
    private float attendance_percentage;
    private float score;
    private String grade;

    public Student() {
    }

    public Student(int rollno, String sname, String course, float attendance_percentage, float score) {
        this.rollno = rollno;
        this.sname = sname;
        this.course = course;
        this.attendance_percentage = attendance_percentage;
        this.score = score;
        // this.grade = grade;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public float getAttendance_percentage() {
        return attendance_percentage;
    }

    public void setAttendance_percentage(float attendance_percentage) {
        this.attendance_percentage = attendance_percentage;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void calculateGrade() throws LowAttendance {
        if (attendance_percentage < 60) {
            grade = "fail";
            throw new LowAttendance("Attendance is below 60% for " + " roll no. " + rollno);
        }

        if (score > 90) {
            grade = "A+";
        } else if (score > 80 && score <= 90) {
            grade = "A";
        } else if (score > 70 && score <= 80) {
            grade = "B";
        } else if (score > 60 && score <= 70) {
            grade = "C";
        } else {
            grade = "F";
        }

    }

    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", sname=" + sname + ", course=" + course + ", attendance_percentage="
                + attendance_percentage + ", score=" + score + ", grade=" + grade + "]";
    }
}
