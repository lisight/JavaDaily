package test.task.day10.task01;

public class StudentService implements IStudentService{
    Student[] stus = new Student[5];
    @Override
    public int save(Student stu) {
        for(int i = 0; i < 5 ; i ++){
            if (null == stus[i]){
                stus[i]=stu;
                return 1;
            }
        }
        return 0;
    }

    @Override
    public int delete(int sn) {
        for(int i = 0; i < 5 ; i ++){
            if (sn == stus[i].getId()){
                stus[i]=null;
                return i;
            }
        }
        return -1;
    }

    @Override
    public int update(Student stu) {
        int sn = stu.getId();
        for(int i = 0; i < 5 ; i ++){
            if (sn == stus[i].getId()){
                stus[i]=null;
                return i;
            }
        }
        return -1;
    }

    @Override
    public Student query(int sn) {
        for(int i = 0; i < 5 ; i ++){
            if (sn == stus[i].getId()){
                return stus[i];
            }
        }
        return null;
    }
}
