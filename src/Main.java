public class Main {
    public static void main(String[] args) {

        // var moneyInBill - количество денег на счету клиента
        int moneyInBill = 100;
        // var moneyAdd - сумма пополнения счета
        int moneyAdd = 1310;
        // var moneyBonus - бонусная сумма за каждые 100 руб. пополнения
        int moneyBonus = moneyAdd / 100;
        // var overallBill - общее кодичество денег на счету клиента
        int overallBill = 0;

        // Расчет суммы денег на счету клиента
        if (moneyAdd > 1000) {
            overallBill = moneyInBill + moneyAdd + moneyBonus;
        } else {
            overallBill = moneyInBill + moneyAdd;
        }

        System.out.println("На счету клиента сейчас " + overallBill + " руб.");
    }
}