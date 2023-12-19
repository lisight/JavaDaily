package test.task.day08.task02;

public class User {
    private Integer id;
    private String passwd;
    private String email;

    public int getId() {
        return id;
    }

    public String getPasswd() {
        return passwd;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User() {
    }

    public User(int id, String passwd, String email) {
        this.id = id;
        this.passwd = passwd;
        this.email = email;
    }

    public void showInfo(){
        System.out.println("用户id:"+id);

    }
}

class test{
    public static void main(String[] args) {
        User user = new User();
        user.showInfo();

    }
}
