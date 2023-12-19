package test.task.day03.task02;

public class AnalyseCode {
    {
        int a = 10;
        a++;
        int b = 20;
        int c = ++a + b;
        System.out.println(c++);
    }

    public static void main(String[] args) {
        AnalyseCode test = new AnalyseCode();
    }
}

//分析: a++ 是先执行完本段程序,再执行 a=a+1; ++a 是先执行 a=a+1, 然后执行本段程序