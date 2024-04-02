package Clase_19_03;

public class Main {
    public static void main(String[] args) {
        SavingsAccount account1 = new SavingsAccount(150000,0.05f, true);
        CurrentAccount account2 = new CurrentAccount(125500,0.1f,100f);

        account1.withdraw(15000f);
        account1.monthlyStatement();
        account1.consign(1100f);
        account1.consign(98700f);
        account1.consign(4500f);
        account1.print();
        account2.consign(10000f);
        account2.monthlyStatement();
        account2.withdraw(50000f);
        account2.print();
    }
}
