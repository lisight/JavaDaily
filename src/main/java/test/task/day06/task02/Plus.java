package test.task.day06.task02;

public class Plus {
    public static int plus(int a ,int b){
        return a+b;
    }
    public static double plus(double a,double b){
        return a+b;
    }
    public static String compute(int a,int b){
        return("相加="+(a+b)+"\n相减="+(a-b)+"\n相乘="+(a*b)+"\n相除="+(a/b));
    }

    public static void main(String[] args) {
        int a = 50,b=26;
        double c = 75.2,d=568.2554;
        System.out.println(plus(a,b));
        System.out.println(plus(c,d));
        System.out.println(compute(a,b));
    }

}

