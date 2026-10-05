package org.example.Components;

public class Subject {
    private final String subjectName;
    private final String subjectCode;
    private final String department;
    private final long upId;

    public Subject(String subjectName, String subjectCode, String department, long upId) {
        this.subjectName = subjectName;
        this.subjectCode = subjectCode;
        this.department = department;
        this.upId = upId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public String getDepartment() {
        return department;
    }

    public long getUpId() {
        return upId;
    }

    @Override
    public String toString() {
        return "Subject Name: " + subjectName +
                ", Subject Code: " + subjectCode +
                ", Department: " + department +
                ", Up Id: " + upId +"\n";
    }
}
