package test.task.day09.task02;

public class Flighter implements Weapon{
    @Override
    public void attack() {
        System.out.println("导弹");
    }

    @Override
    public void move() {
        System.out.println("滑翔");

    }
}
