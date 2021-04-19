package com.kaizhang.spring.beans.dependencyinjection;

/**
 * @author kaizhang
 * @date 2021-04-02 22:00
 */
public class People {
    private Student student;

    private Teacher teacher;

    private Programmer programmer;

    private String height;

    /**
     * 通过set方法注入 {@link student}
     */
    public void setStudent(Student student) {
        this.student = student;
    }

    /**
     * 通过构造方法-有参构造注入 {@link teacher} {@link height}
     *
     * @param teacher
     * @param height
     */
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
