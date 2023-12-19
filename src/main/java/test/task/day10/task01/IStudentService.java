package test.task.day10.task01;

public interface IStudentService {
    public int save(Student stu);
    public int delete(int sn);
    public int update(Student stu);
    public Student query(int sn);
}
