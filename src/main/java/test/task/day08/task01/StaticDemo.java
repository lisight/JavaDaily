package test.task.day08.task01;

public class StaticDemo {
    public StaticDemo() {
        System.out.println("这是构造器");
    }
    static{
        System.out.println("staticWork");
    }

    public void work(){
        System.out.println("work");
    }

    public static void main(String[] args) {
//        StaticDemo staticDemo = new StaticDemo();
        System.out.println("123");}

}

//class Test {
//    public static void main(String[] args) {
////        StaticDemo staticDemo = new StaticDemo();
//        System.out.println("123");
//
//
//
//    }
//}
