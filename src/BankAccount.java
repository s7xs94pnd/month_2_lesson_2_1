class BankAccount{
private double amount;

    public double getAmount() {
        return amount;
    }
    public void deposit(double sum) {
        if (sum > 0) {
            amount += sum;
            System.out.println("На счет зачислено: "+sum+"\nВаш текуший: "+amount);
        }
        }

    public void withDraw(int sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Запрашиваемая сумма превышает остаток на счете", amount);
        }
        amount -= sum;
    }
}

