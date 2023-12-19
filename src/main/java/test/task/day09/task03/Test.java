package test.task.day09.task03;

public class Test {
    public static void main(String[] args) {
        Add add = new Add();
        Sub sub = new Sub();
        Mul mul = new Mul();
        Divid divid = new Divid();
        System.out.println(add.calc(5,8));
        System.out.println(sub.calc(5,8));
        System.out.println(mul.calc(5,8));
        System.out.println(divid.calc(5,8));


    }
}
