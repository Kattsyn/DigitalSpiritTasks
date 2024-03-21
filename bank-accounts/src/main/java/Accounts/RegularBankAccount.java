package Accounts;

public class RegularBankAccount extends BankAccount {
    public RegularBankAccount(String name, int pin) {
        super(name, pin);
    }

    @Override
    public void pay(double amount, String sellerName, int pin) {
        if (validatePin(pin)) {
            if (getBalance() >= amount) {
                System.out.println("Оплата на счет " + sellerName + " в размере: " + amount + " рублей.");
                setBalance(getBalance() - amount);
            } else {
                System.out.println("Недостаточно средств.");
            }
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
        if (getBalance() < 5000) {
            addPenalties(100);
        }
        increaseMonthsSinceOpening();
        payPenalties();
    }
}
