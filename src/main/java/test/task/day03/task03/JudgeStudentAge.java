package test.task.day03.task03;

import test.task.day03.task01.StudentDemo;

public class JudgeStudentAge {
    public static void main(String[] args) {
        StudentDemo xiaoming = new StudentDemo();
        StudentDemo xiaogang = new StudentDemo();
        xiaoming.age = 18;
        xiaogang.age = 17;
        System.out.println(xiaoming.age == xiaogang.age);
    }


}
