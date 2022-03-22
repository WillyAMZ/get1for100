public class Main {
    public static void main(String[] args) {

        //входные данные
        int personalAccount = 600;        //Счет клиента
        int depositAmount = 900;         // Сумма пополнения

        //логика программы
        int bonusRub = (depositAmount > 1000) ? 1 : 0;
        int bonus = depositAmount / 100 * bonusRub;
        int balance = personalAccount + depositAmount + bonus;
        if (bonusRub == 1) {
            System.out.println("Платеж на сумму " + depositAmount + " руб. плюс бонус в размере " + bonus + " руб. зачислен. Ваш баланс: " + balance + " руб.");
        } else {
            System.out.println("Платеж на сумму " + depositAmount + " руб. зачислен. Ваш баланс: " + balance + " руб.");
        }
    }
}
