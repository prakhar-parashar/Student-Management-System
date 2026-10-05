package org.example.Entities;

import org.example.Components.Address;
import org.example.Components.Attendance;
import org.example.Components.Subject;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Student extends Person{
    Map<LocalDateTime, Attendance> attendanceMap = new HashMap<>();
    Map<String, Subject> subjectMap = new HashMap<>();
    Map<Long, Book> bookMap = new HashMap<>();

    public Student(String name, String email, String userName, String password, int age, long mobileNo, Address address, Map<String, Subject> subjectMap) {
        super(name, email, userName, password, age, mobileNo, address);
        this.subjectMap = subjectMap;
    }

    public Student(String name, String userName, String password, int age, long mobileNo, Address address, Map<String, Subject> subjectMap) {
        super(name, userName, password, age, mobileNo, address);
        this.subjectMap = subjectMap;
    }

    public Map<LocalDateTime, Attendance> getAttendanceMap() {
        return attendanceMap;
    }

    public void setAttendanceMap(Map<LocalDateTime, Attendance> attendanceMap) {
        this.attendanceMap = attendanceMap;
    }

    public Map<String, Subject> getSubjectMap() {
        return subjectMap;
    }

    public void setSubjectMap(Map<String, Subject> subjectMap) {
        this.subjectMap = subjectMap;
    }

    public Map<Long, Book> getBookMap() {
        return bookMap;
    }

    public void setBookMap(Map<Long, Book> bookMap) {
        this.bookMap = bookMap;
    }

}
