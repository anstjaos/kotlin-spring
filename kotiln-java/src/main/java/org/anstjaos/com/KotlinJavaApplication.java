package org.anstjaos.com;

import java.time.LocalDate;

import static java.lang.System.out;

public class KotlinJavaApplication {

    public static void main(String[] args) {
        Student student = new Student();

        student.name = "Steve Rodgers";
        student.setBirthDate(LocalDate.of(1918, 7, 4));

        out.println(student.name);
        out.println(student.getBirthDate());
        out.println(student.getAge());

        student.changeGrade("A");
        out.println(student.getGrade());
    }
}
