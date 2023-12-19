package test.task.day16.task02;

public class YoungStudent extends Student{
    public YoungStudent(String name, Integer age, double score) {
        super(name, age, score);
    }
    public YoungStudent(Student student){
        super(student.name, student.age, student.score);
    }
}
