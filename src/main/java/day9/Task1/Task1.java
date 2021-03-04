package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Алексей", "группа1");
        Teacher teacher = new Teacher("Сергей", "программирование");
        System.out.println(student);
        System.out.println(teacher);
        student.printInfo();
        teacher.printInfo();
    }
}


