package Clase_19_03;

public class CurrentAccount extends Account{
    protected float overTurn;

    //Constructor

    public CurrentAccount(float balance, float annualRate, float overTurn) {
        super(balance, annualRate);
        this.overTurn = overTurn;
    }

    //Getter and Setter
    //Metodos
    public void print(){
        System.out.println("Datos de la cuenta de ahorros:");
        System.out.println("Sobregiro: "+this.overTurn);
        System.out.println("Número de consignaciones: "+super.numberConsignments);
        System.out.println("Saldo: "+super.balance);
        System.out.println("Número de retiros"+super.numberWithdrawals);
        System.out.println("Tasa anual: "+super.annualRate);
        System.out.println("Comisión mensua: "+super.monthlyCommission);
        System.out.println();
    }
    @Override
    public void consign(float amount) {
        super.consign(amount);
    }

    @Override
    public void withdraw(float amount) {
        super.withdraw(amount);
    }

    @Override
    public void monthlyStatement() {
        super.monthlyStatement();
    }
}
