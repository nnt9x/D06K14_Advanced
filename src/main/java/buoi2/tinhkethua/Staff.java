package buoi2.tinhkethua;

public class Staff extends Human{
    private String position;

    public Staff(String position) {
        this.position = position;
    }

    public Staff(int id, String name, String email, String phone, String position) {
        super(id, name, email, phone);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
