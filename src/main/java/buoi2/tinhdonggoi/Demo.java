package buoi2.tinhdonggoi;

public class Demo {
    public String name;
    private int mark;
    protected String address;
    String phone;

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        if (mark < 0 || mark > 10) {
            throw new RuntimeException("Điểm không hợp lệ");
        }
        this.mark = mark;
    }
}
