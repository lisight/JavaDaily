package test.task.day09.task02;

public class Tank implements Weapon{

    @Override
    public void attack() {
        System.out.println("放炮");
    }

    @Override
    public void move() {
        System.out.println("履带");

    }
}
