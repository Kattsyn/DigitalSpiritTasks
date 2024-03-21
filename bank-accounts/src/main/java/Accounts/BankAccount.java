package Accounts;
// Так как большая часть методов и полей сходятся у всех счетов,
// то я решил выбрать реализацию через абстрактный класс, тк
// у счетов есть различие в реализации вывода средств (у молодежного счета есть комиссия),
// а также на оплату (у продвинутого и молодежного кешбек)
// Плюс, абастрактный класс - заготовка класса, а сам Accounts.BankAccount отдельным
// классом счета я рассматривать не буду.
// из абстрактных методов только pay(), withdraw() и calculatePenalties().
//

public abstract class BankAccount {

    private String name;
    private double balance;
    private int pinHashCode;
    private int monthsSinceOpening;
    private double penalties;

    public BankAccount(String name, int pin) {
        this.name = name;
        this.balance = 0;
        setPin(pin);
        this.monthsSinceOpening = 0;
        this.penalties = 0;
    }

    public abstract void pay(double amount, String sellerName, int pin);

    public abstract void withdraw(double amount, int pin);

    public abstract void calculatePenalties();

    private void setPin(int pin) {
        this.pinHashCode = Integer.hashCode(pin);
    }

    public void changePin(int oldPin, int newPin) {
        if (validatePin(oldPin)) {
            setPin(newPin);
        }
    }

    //Т.к. для переопределения методов pay() withdraw() нам нужна будет проверка
    //на пин-код у реализуемых классов, то модификатор доступа - protected.
    //public в данном случае слишком небезопасен.
    protected boolean validatePin(int pin) {
        return this.pinHashCode == Integer.hashCode(pin);
    }

    protected void increaseMonthsSinceOpening() {
        monthsSinceOpening++;
    }

    public void setName(String name, int pin) {
        if (validatePin(pin)) {
            this.name = name;
        }
    }

    protected double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public void outBalance(int pin) {
        if (validatePin(pin)) {
            System.out.println("Баланс: " + Math.floor(balance * 100) / 100);
        }
    }

    protected void addPenalties(double penalties) {
        this.penalties += penalties;
    }

    protected void payPenalties() {
        if (balance >= penalties) {
            System.out.println("Оплата за обслуживание и штрафы");
            balance -= penalties;
            penalties = 0;
        } else {
            System.out.println("Недостаточно средств для оплаты обслуживания.");
        }
    }

    public void toUpBalance(double amount, int pin) {
        if (validatePin(pin)) {
            balance += amount;
        }
    }

    public void outOwnerInfo(int pin) {
        if (validatePin(pin)) {
            System.out.println("Владелец счета: " + this.name);
        }

    }

    public void outAccountInfo(int pin) {
        if (validatePin(pin)) {
            System.out.println("Владелец счета: " + name);
            System.out.println("Баланс: " + Math.floor(balance * 100) / 100 + " рублей.");
            System.out.println("Месяцев с открытия счета: " + monthsSinceOpening);
        }
    }
}
