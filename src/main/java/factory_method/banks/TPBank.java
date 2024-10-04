package factory_method.banks;

class TPBank implements Bank{
    private String key;

    public TPBank(String key) {
        this.key = key;
    }

    @Override
    public String getBankName() {
        return "TPBank";
    }

    @Override
    public boolean payment(int amount) {
        // Logic: xac thuc, thanh toan...
        return true;
    }
}
