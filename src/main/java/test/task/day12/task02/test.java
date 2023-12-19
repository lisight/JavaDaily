package test.task.day12.task02;

public class test {
    public static void main(String[] args) {
        double a = 1052.20;
        double b = 57.35;
        Money money =new Money();
        System.out.println(money.add(a,b));
        System.out.println(money.sub(a,b));
        System.out.println(money.mul(a,b));
        System.out.println(money.divid(a,b,Money.COMPARE_VALUE));
    }
}
