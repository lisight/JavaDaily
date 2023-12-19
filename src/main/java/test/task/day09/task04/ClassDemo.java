package test.task.day09.task04;

import java.util.ArrayList;

public class ClassDemo {
    Integer classId ;
    ArrayList<Student> students = new ArrayList<>();
    public void input(Student stu){
        students.add(stu);

    }
    public Student getStudentBySn(int sn){
        for(Student stu:students){
            int target = stu.getId();
            if (target == sn)
                return stu;
        }
        return null;
    }


}
