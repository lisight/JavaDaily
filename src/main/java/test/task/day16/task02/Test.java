package test.task.day16.task02;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList();
        Student sy = new Student("sy", 18, 59);
        Student zs = new Student("zs", 23, 90);
        Student lisi = new Student("lisi", 19, 90);
        Student wangwu = new Student("wangwu", 20, 99);
        Student sunliu = new Student("sunliu", 22, 100);
        students.add(sy);
        students.add(zs);
        students.add(lisi);
        students.add(wangwu);
        students.add(sunliu);
        for (Student stu:students){
            System.out.println(stu);
        }
        ArrayList<Student> oldStudents = new ArrayList<>();
        ArrayList<Student> youngStudents = new ArrayList<>();
        //根据年龄,纳入新集合
        for(Student stu:students){
            if (stu.age>19){
                oldStudents.add(new OldStudent(stu));
            }else{
                youngStudents.add(new YoungStudent(stu));
            }
        }
        //把考试95分以上的学生名字和学生分数打印出来
        for(Student stu:students){
            if(stu.score>=95){
                System.out.println("名字:"+stu.name+",分数:"+stu.score);
            }
        }






    }
}
