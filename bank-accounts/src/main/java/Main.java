import Accounts.AdvancedBankAccount;
import Accounts.BankAccount;
import Accounts.RegularBankAccount;
import Accounts.YouthBankAccount;

public class Main {
    public static void main(String[] args) {

        BankAccount regularBankAccount = new RegularBankAccount("Vladimir", 1458);
        regularBankAccount.toUpBalance(13400, 1458);
        regularBankAccount.pay(359, "BookMarket", 1458); //Оплата на счет BookMarket в размере: 359.0 рублей.
        regularBankAccount.withdraw(1200, 1458); //Вывод наличными 1200.0 рублей..
        regularBankAccount.calculatePenalties(); //Оплата за обслуживание и штрафы
        regularBankAccount.outAccountInfo(1458); //Владелец счета: Vladimir\n Баланс: 11741.0 рублей.\n Месяцев с открытия счета: 1


        BankAccount advancedBankAccount = new AdvancedBankAccount("Vladimir", 1458);
        advancedBankAccount.toUpBalance(13400, 1458);
        advancedBankAccount.pay(359, "BookMarket", 1458); //Оплата на счет BookMarket в размере: 359.0 рублей.\n Получен кешбек 3.59 руб.
        advancedBankAccount.withdraw(1200, 1458); //Вывод наличными 1200.0 рублей..
        advancedBankAccount.calculatePenalties(); //Оплата за обслуживание и штрафы
        advancedBankAccount.outAccountInfo(1458); //Владелец счета: Vladimir\n Баланс: 11744.59 рублей..\n Месяцев с открытия счета: 1


        BankAccount youthBankAccount = new YouthBankAccount("Vladimir", 1458);
        youthBankAccount.toUpBalance(13400, 1458);
        youthBankAccount.pay(359, "BookMarket", 1458); //Оплата на счет BookMarket в размере: 359.0 рублей.\n Получен кешбек 7.18 руб.
        youthBankAccount.withdraw(1200, 1458); //Вывод наличными 1200.0 рублей..
        youthBankAccount.calculatePenalties(); //Оплата за обслуживание и штрафы
        youthBankAccount.outAccountInfo(1458); //Владелец счета: Vladimir\n Баланс: 11838.18 рублей..\n Месяцев с открытия счета: 1


    }
}
