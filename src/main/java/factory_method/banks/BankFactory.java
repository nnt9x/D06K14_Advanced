package factory_method.banks;

public class BankFactory {
    // Tra ve chinh xac doi tuong Bank can lam viec
    private BankFactory() {

    }

    public static Bank getBank(BankType type) {
        switch (type) {
            case TPBANK:
                return new TPBank("BKACAD");
            case VIETCOMBANK:
                return new VietcomBank();
            case HDBANK:
                return new HDBank();
            default:
                throw new RuntimeException("Error");
        }
    }
}
