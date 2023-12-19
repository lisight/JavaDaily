package test.task.day09.task04;


/**
 4.定义一个学生类，信息有学生编号、学生姓名、学生年龄
 要求：
 属性包括：属性私有化，对外提供公开的set和get方法
 提供无参构造和有参数构造方法
 定义一个班级类 ClassDemo，信息有班级编号，学生数组，提供一个录入学生的方法 input(Student stu),和根据学生编号获取学生对象的方法getStudentBySn(int sn);
 Sn(学生编号)	学生姓名	年龄
 1	张三	23
 2	李四	27
 3	王二	19
 4	赵五	25
 5	上云	18
 定义一个测试类，测试录入和查询功能，并且把所有录入的学生信息打印出来
 */
public  class Student {
    private Integer id;
    private String name;
    private Integer age;
    private Integer status;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getStatus() {
        return status;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Student() {
    }

    public Student(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public void study(){
        System.out.println("姓名:"+name+"\n状态:"+status);
    }
}
