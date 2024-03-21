package Accounts;

public class AdvancedBankAccount extends BankAccount{
    public AdvancedBankAccount(String name, int pin) {
        super(name, pin);
    }

    @Override
    public void pay(double amount, String sellerName, int pin) {
        if (validatePin(pin)) {
            if (getBalance() >= amount) {
                System.out.println("Оплата на счет " + sellerName + " в размере: " + amount + " рублей.");
                setBalance(getBalance() - amount);
                getCashBack(amount);
            } else {
                System.out.println("Недостаточно средств");
            }
        }
    }

    private void getCashBack(double amountWithoutCashBack) {
        if (100 < amountWithoutCashBack * 0.01) {
            System.out.println("Получен кешбек 100 руб");
            setBalance(getBalance() + 100);
        } else {
            System.out.println("Получен кешбек " + amountWithoutCashBack * 0.01 + " руб.");
            setBalance(getBalance() + amountWithoutCashBack * 0.01);
        }
    }

    @Override
    public void withdraw(double amount, int pin) {
        if (validatePin(pin)) {
            if (getBalance() >= amount) {
                System.out.println("Вывод наличными " + amount + " рублей..");
                setBalance(getBalance() - amount);
            } else {
                System.out.println("Недостаточно средств.");
            }
        }
    }

    @Override
    public void calculatePenalties() {
        if (100 < getBalance() * 0.1) {
            addPenalties(100);
        } else {
            addPenalties(getBalance() * 0.1);
        }
        increaseMonthsSinceOpening();
        payPenalties();
    }
}
