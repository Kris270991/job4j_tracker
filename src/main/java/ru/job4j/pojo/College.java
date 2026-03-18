package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Лазарева Кристина Александровна");
        student.setDateOfEntrance(2025, 9, 1);
        student.setGroupNumber(131);
        System.out.println("ФИО: " + student.getFullName() + '.' + System.lineSeparator() + "группа: " + student.getGroupNumber() + '.' + System.lineSeparator() + "дата поступления: " + student.getDateOfEntrance() + '.');
    }
}
