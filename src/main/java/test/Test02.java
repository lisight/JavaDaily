package test;

/**
 1、使用notepad++编辑器编写一个java程序，定义一个包含main方法的java类，在main方法中使用合适的数据类型定义如下变量，标识符要严格遵守java规范，并且类名用文档注释标识这是学生类，单行注释标识学生信息。
 学生姓名；学生年龄；学生身高，学生性别，家庭住址，体重，并在控制台使用System.out.println()方法将这些变量数据输出到控制台。
 */

/*
这是一个学生类
 */
public class Test02 {
    public static void main(String[] args) {
        //学生姓名
        String name = "张三";
        //学生年龄
        int age = 20;
        //学生身高,厘米
        int height = 175;
        //学生性别,男=true 女=false;
        Boolean gender = true;
        //学生家庭住址
        String address = "广东广州";
        //学生体重,公斤
        int weight = 70;
        System.out.println("姓名:"+ name);
        System.out.println("年龄:"+ age + "岁");
        System.out.println("身高:"+ height + "厘米");
        System.out.println("性别:"+ (gender?"男":"女"));
        System.out.println("住址:"+ address);
        System.out.println("体重:"+ weight + "公斤");

    }

}

