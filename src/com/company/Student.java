package com.company;

import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private int gradeLevel;

    public Student (){
        id = 000;
        name = "John Doe";
        gradeLevel = 1;
    }

    public Student(int id, String name, int gradeLevel) {
        this.id = id;
        this.name = name;
        this.gradeLevel = gradeLevel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                gradeLevel == student.gradeLevel &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, gradeLevel);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gradeLevel=" + gradeLevel +
                '}';
    }
}
