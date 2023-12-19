package test.task.day04.task04;

public class ComputeNum {
    public static void main(String[] args) {
        int total =0;
        for(double i = 1; i<=1000;i++ ){
            if( i % 3 == 0 ){
                total= total+ (int)i;
                System.out.println(i);
            }
        }
        System.out.println(total);
    }
}
//更高效的算法,可以,i=i+3,不需要判断