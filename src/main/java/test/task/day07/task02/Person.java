package test.task.day07.task02;

/**
 * 2.定义一个不带参数构造器，再定义一个带参数构造器的 person 类。人类中定义普通方法打印我是普通方法
 */

public class Person {
    String name;
    Integer age;
    public void call(){
        System.out.println("我是人类");
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }


}
