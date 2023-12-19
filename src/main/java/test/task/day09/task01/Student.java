package test.task.day09.task01;

public class Student extends User{
    Integer studyId;
    public void showInfo(){
        System.out.println("id:"+id);
        System.out.println("studyId:"+studyId);
    }
}

class test{
    public static void main(String[] args) {
        Student student = new Student();
        student.showInfo();

    }

}

