package ru.job4j.pojo;

import java.time.LocalDate;

public class Student {
    private String fullName;
    private int groupNumber;
    private LocalDate dateOfEntrance;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public LocalDate getDateOfEntrance() {
        return dateOfEntrance;
    }

    public void setDateOfEntrance(int year, int month, int dayOfMonth) {
        this.dateOfEntrance = LocalDate.of(year, month, dayOfMonth);
    }
}
