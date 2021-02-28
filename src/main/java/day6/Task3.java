package day6;

import java.lang.Math;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Александр", "Химия");
        Student student = new Student();
        student.setName("Дмитрий");
        teacher.evaluate(student.getName());


    }
}

class Teacher {
    private int n = (int) (Math.random() * (5 - 2) + 2);
    private String name;
    private String subject;
    private String mark;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(String studentName) {
        if (n == 2) {
            mark = "Неудовлетворительно";
        } else if (n == 3) {
            mark = "Удовлетворительно";
        } else if (n == 4) {
            mark = "Хорошо";
        } else if (n == 5) {
            mark = "Отлично";
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + studentName + " по предмету " + subject + " на оценку " + mark+".");

    }
}

class Student {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
