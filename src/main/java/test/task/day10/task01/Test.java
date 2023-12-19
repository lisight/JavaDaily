package test.task.day10.task01;


public class Test {
    public static void main(String[] args) {
        Student zhangsan = new Student(1, "张三", 23);
        Student lisi = new Student(2, "李四", 27);
        Student wanger = new Student(3, "王二", 19);
        Student zhaowu = new Student(4, "赵五", 25);
        Student shangyun = new Student(5, "上云", 18);
        StudentService studentService = new StudentService();
        studentService.save(zhangsan);
        studentService.save(lisi);
        studentService.save(wanger);
        studentService.save(zhaowu);
        studentService.save(shangyun);
        studentService.delete(5);
        lisi.setAge(28);
        System.out.println(studentService.query(1));



    }
}
