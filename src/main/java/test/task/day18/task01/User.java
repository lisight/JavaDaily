package test.task.day18.task01;

public class User implements Comparable<User>{
    String username;
    int loginCount;

    public User(String username, int loginCount) {
        this.username = username;
        this.loginCount = loginCount;
    }

    public User() {
    }
    public int compareTo(User otherUser) {
        return Integer.compare(this.loginCount, otherUser.loginCount);
    }


}
