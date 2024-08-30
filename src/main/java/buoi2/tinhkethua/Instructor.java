package buoi2.tinhkethua;

public class Instructor extends Human{
    private String address;
    private String major;

    public Instructor(String address, String major) {
        this.address = address;
        this.major = major;
    }

    public Instructor(int id, String name, String email, String phone, String address, String major) {
        super(id, name, email, phone);
        this.address = address;
        this.major = major;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
