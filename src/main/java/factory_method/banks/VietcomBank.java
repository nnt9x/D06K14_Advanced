package factory_method.banks;

class VietcomBank implements Bank {

    @Override
    public String getBankName() {
        return "VietcomBank";
    }

    @Override
    public boolean payment(int amount) {
        // Logic: xac thuc...
        return true;
    }
}
