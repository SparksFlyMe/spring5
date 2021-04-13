package com.kaizhang.spring.beans;

/**
 * @author kaizhang
 * @date 2021-04-02 22:00
 */
public class People {
    private Student student;

    private Teacher teacher;

    private Programmer programmer;

    private String height;

    public void setStudent(Student student) {
        this.student = student;
    }

    public People(Teacher teacher, String height) {
        this.teacher = teacher;
        this.height = height;
    }

    @Override
    public String toString() {
        return "People{" +
                "student=" + student +
                ", teacher=" + teacher +
                ", programmer=" + programmer +
                ", height=" + height +
                '}';
    }
}
