public class Main {
    public static void main(String[] args) {
        int balance = 10;
        int refill = 1000;
        int bonus;
        if (refill >= 1000) {bonus = refill / 100;
        } else {bonus = 0;
        }

        int total = balance + refill + bonus;
        System.out.println("Итоговая сумма " + total + ", из них бонус " + bonus);
    }
}
