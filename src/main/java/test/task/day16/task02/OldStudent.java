package test.task.day16.task02;

public class OldStudent extends Student{
    public OldStudent(String name, Integer age, double score) {
        super(name, age, score);
    }
    public OldStudent(Student student){
        super(student.name, student.age, student.score);
    }
}
