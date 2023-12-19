package test.task.day09.task02;

public class Test {
    public static void main(String[] args) {
        Tank tiger = new Tank();
        Flighter f22 = new Flighter();
        Warship liaoning = new Warship();

        tiger.attack();
        f22.attack();
        liaoning.attack();
        tiger.move();
        f22.move();
        liaoning.move();

    }

}
