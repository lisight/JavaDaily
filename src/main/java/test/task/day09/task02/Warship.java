package test.task.day09.task02;

public class Warship implements Weapon{
    @Override
    public void attack() {
        System.out.println("鱼雷");
    }

    @Override
    public void move() {
        System.out.println("航行");

    }
}
