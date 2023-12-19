package test.task.day08.task03;

/**
 * 3.定义一个学生类，信息有学生编号、学生姓名、学生年龄、学习状态 int 类型status（0-1）
 * 要求：
 * 属性包括：属性私有化，对外提供公开的set和get方法
 * 提供无参构造和有参数构造方法
 * 提供一个study()方法，通过该方法打印学生姓名和学习状态。
 * 编写测试类创建对象，调用study()方法。
 */
public class Student {
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

    public Student(Integer id, String name, Integer age, Integer status) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.status = status;
    }
    public void study(){
        System.out.println("姓名:"+name+"\n状态:"+status);
    }
}
class test{
    public static void main(String[] args) {
        Student student = new Student();
        student.study();
    }
}