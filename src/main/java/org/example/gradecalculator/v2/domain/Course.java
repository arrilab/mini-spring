package org.example.gradecalculator.v2.domain;

public class Course {
    private final String subject;   // 과목명
    private final int credit;       // 학점
    private final String grade;     // 성적

    public Course(String subject, int credit, String grade) {
        this.subject = subject;
        this.credit = credit;
        this.grade = grade;
    }

    public int getCredit() {
        return credit;
    }

    public double multiplyCreditAndCourseGrade() {
        return credit * getGradeToNumber();
    }

    public double getGradeToNumber() {
        return switch (this.grade) {
            case "A+" -> 4.5;
            case "A" -> 4.0;
            case "B+" -> 3.5;
            case "B" -> 3.0;
            case "C+" -> 2.5;
            case "C" -> 2.0;
            default -> 0.0;   // 혹시 모를 예외 상황 대비
        };
    }
}