public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(15000);

        while (true){
            try {
                account.withDraw(6000);
                System.out.println("снятие 6000");
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                System.out.println("Доступная сумма для снятия: " + e.getRemainingAmount());
                try {
                    account.withDraw((int)e.getRemainingAmount());
                    System.out.println("Снято: " + e.getRemainingAmount());
                } catch (LimitException ex) {
                }
                break;
            }
        }
    }
}