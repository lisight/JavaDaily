package test.task.day09.task04;

public class Test {
    public static void main(String[] args) {
        Student zhangsan = new Student(1, "张三", 23);
        Student lisi = new Student(2, "李四", 27);
        Student wanger = new Student(3, "王二", 29);
        Student zhaowu = new Student(4, "赵五", 25);
        Student shangyun = new Student(5, "上云", 18);
        ClassDemo classDemo = new ClassDemo();
        classDemo.input(zhangsan);
        classDemo.input(lisi);
        classDemo.input(wanger);
        classDemo.input(zhaowu);
        classDemo.input(shangyun);
        System.out.println(classDemo.getStudentBySn(3).getName());
        for(Student stu: classDemo.students){
            System.out.println("姓名:"+stu.getName());
            System.out.println("学号:"+stu.getId());
            System.out.println("年龄"+stu.getAge());
        }

    }
}