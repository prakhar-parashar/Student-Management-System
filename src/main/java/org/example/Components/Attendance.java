package org.example.Components;

import org.example.Entities.Faculty;

import java.time.LocalDateTime;

public class Attendance {
    private final LocalDateTime dateTime;
    private final int credit;
    private final Subject subject;
    private final Faculty teacher;

    public Attendance(LocalDateTime dateTime, int credit, Subject subject, Faculty teacher) {
        this.dateTime = dateTime;
        this.credit = credit;
        this.subject = subject;
        this.teacher = teacher;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public int getCredit() {
        return credit;
    }

    public Subject getSubject() {
        return subject;
    }

    public Faculty getTeacher() {
        return teacher;
    }

    @Override
    public String toString() {
        return "Attendance of " + dateTime +
                ", credits- " + credit +
                ", subject- " + subject.getSubjectName() +
                ", teacher-" + teacher.getName() + "\n";
    }
}
