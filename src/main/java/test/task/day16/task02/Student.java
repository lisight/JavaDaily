package test.task.day16.task02;

public class Student {
    String name;
    Integer age;
    double score;

    public Student(String name, Integer age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
