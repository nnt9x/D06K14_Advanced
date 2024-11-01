package observer;

public class User implements Listener {
    private String id;
    private String name;
    private String email;
    private int level = 2; // admin (0), employee (1), customer (2)

    public User() {
    }

    public User(String id, String name, String email, int level) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.level = level;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public void callback(String msg) {
        System.out.println("Notify: " + msg + ", email to: " + this.email);
    }
}
