package factory_method;


import factory_method.banks.Bank;
import factory_method.banks.BankFactory;
import factory_method.banks.BankType;

public class Main {
    public static void main(String[] args) {
        // Ket noi vietcom thanh toan
        Bank bank = BankFactory.getBank(BankType.TPBANK);
        // in thong tin
        System.out.println(bank.getBankName());
        // Thanh toan
        System.out.println(bank.payment(1000));
    }
}
