package test.task.day07.task01;

public class Student {
    String name;
    Integer age;
    String telephone;
    String address;
    int saveMoney;
    int sum;
    public Student(String name, Integer age, String telephone, String address, int saveMoney, int sum) {
        this.name = name;
        this.age = age;
        this.telephone = telephone;
        this.address = address;
        this.saveMoney = saveMoney;
        this.sum = sum;
    }
    public void showSaveMoney(){
        System.out.println("一共存了"+(saveMoney*sum)+"元钱");
    }

    public static void main(String[] args) {
        Student zhangsan = new Student("zhangsan",18,"15807901603","广东",10,120);
        zhangsan.showSaveMoney();
    }
}

