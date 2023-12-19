package test.task.day12.task02;

public class Money {
    public static final double COMPARE_VALUE = 0.5;
    public double add(double a,double b){
        return a+b;
    }
    public double sub(double a,double b){
        return a-b;
    }
    public double mul(double a,double b){
        return a*b;
    }
    public double divid(double a,double b,double compareValue){
        if (a/b-(int)(a/b)<compareValue)
            return a/b;
        else
            return a/b+1;
    }



}
