package test.task.day07.task03;

public class Student2 {
    String name;
    Integer age;
    String telephone;
    String address;
    int saveMoney;
    int sum;
    public Student2(String name, Integer age, String telephone, String address, int saveMoney, int sum) {
        this.name = name;
        this.age = age;
        this.telephone = telephone;
        this.address = address;
        this.saveMoney = saveMoney;
        this.sum = sum;
    }
    public Student2(){
    }
    public void showSaveMoney(){
        System.out.println("一共存了"+(saveMoney*sum)+"元钱");
    }

    public static void main(String[] args) {
        Student2 zhangsan = new Student2();
        zhangsan.showSaveMoney();
    }
}

