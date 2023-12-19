package test.task.day04.task01;

import java.util.Scanner;

public class JudgeSeason02 {
    public static void main(String[] args) {
        int monthNumber ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份的数字");
        monthNumber = scanner.nextInt();
        switch (monthNumber){
            case 1:
            case 2:
            case 3:
                System.out.println("春天");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("夏天");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("秋天");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("冬天");
                break;
            default:
                System.out.println("请输入1-12之间数字");
        }


    }
}
