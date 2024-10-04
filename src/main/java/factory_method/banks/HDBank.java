package factory_method.banks;

class HDBank  implements Bank{
    @Override
    public String getBankName() {
        return "HDBank";
    }

    @Override
    public boolean payment(int amount) {
        // Logic: ket noi - xac thuc ngan hang
        // Logic: thanh toan
        return true;
    }
}
