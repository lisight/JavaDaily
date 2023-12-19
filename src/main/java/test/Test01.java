package test;

//"""
//        1、 定义一个Java 程序，类名使用 StudentInfo ,使用输出语句打印学生相关信息
//        (1)	学生姓名（sy）
//        (2)	学生性别（boy）
//        (3)	学生年龄（18）
//        2、 把课上常用命令敲熟悉（不用提交检查）
//        """


public class Test01 {
    public static void main(String[] args) {
        StudentInfo test = new StudentInfo();
        test.printInfo();
    }
}

class StudentInfo {
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