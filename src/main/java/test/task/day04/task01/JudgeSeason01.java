package test.task.day04.task01;

import java.util.Scanner;

public class JudgeSeason01 {
    public static void main(String[] args) {
        int monthNumber ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份的数字");
        monthNumber = scanner.nextInt();
        if(monthNumber>0&&monthNumber<4){
            System.out.println("春天");
        }
        if(monthNumber>3&&monthNumber<7){
            System.out.println("夏天");
        }
        if(monthNumber>6&&monthNumber<10){
            System.out.println("秋天");
        }if(monthNumber>9&&monthNumber<13){
            System.out.println("冬天");
        }


    }
}
