package test;

/**
 * 这是一个学生类
 */
public class Student {
    String name = "sy";
    //    '性别 男性=1.女性=0'
    Boolean gender = true;
    Integer age = 18;
    public void printInfo(){
        System.out.println("姓名:" + name );
        System.out.println("性别:" + (gender?"男":"女"));
        System.out.println("年龄:" + age);
    }

}
