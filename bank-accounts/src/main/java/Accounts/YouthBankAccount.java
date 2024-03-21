package Accounts;

public class YouthBankAccount extends BankAccount {
    private boolean hadPaymentsThisMonth;
    private final int WITHDRAWAL_COMMISSION = 10;

    public YouthBankAccount(String name, int pin) {
        super(name, pin);
        this.hadPaymentsThisMonth = false;
    }

    @Override
    public void pay(double amount, String sellerName, int pin) {
        if (validatePin(pin)) {
            if (getBalance() >= amount) {
                System.out.println("Оплата на счет " + sellerName + " в размере: " + amount + " рублей.");
                setBalance(getBalance() - amount);
                getCashBack(amount);
                hadPaymentsThisMonth = true;
            } else {
                System.out.println("Недостаточно средств");
            }
        }
    }

    private void getCashBack(double amountWithoutCashBack) {
        System.out.println("Получен кешбек " + amountWithoutCashBack * 0.02 + " руб.");
        setBalance(getBalance() + amountWithoutCashBack * 0.02);
    }

    @Override
    public void withdraw(double amount, int pin) {
        if (validatePin(pin)) {
            if (getBalance() >= amount + WITHDRAWAL_COMMISSION) {
                System.out.println("Вывод наличными " + amount + " рублей..");
                setBalance(getBalance() - amount);
                setBalance(getBalance() - WITHDRAWAL_COMMISSION);
            } else {
                System.out.println("Недостаточно средств.");
            }
        }
    }

    @Override
    public void calculatePenalties() {
        if (!hadPaymentsThisMonth) {
            addPenalties(300);
        }
        hadPaymentsThisMonth = false;
        increaseMonthsSinceOpening();
    }
}
