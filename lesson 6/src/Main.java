import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // > больше
        // < меньне
        // == равно
        // >= больше или равно
        // <= меньше или равно
        // != не равно
        // &&  логическое и
        // || логическое или
        int twixPrice = 77;
        int marsPrice = 78;
        int snikersPrice = 100;
        int waterPrice = 50;

        boolean isCanBuy = false;

        System.out.println("Введите количество денег");
        int moneyAmaunt = new Scanner(System.in).nextInt();

        if (moneyAmaunt >= twixPrice) {
            System.out.println("Вы можете купить твикс");
            isCanBuy = true;
            if (moneyAmaunt %3 == 0){
                System.out.println("Вы выйграли приз 100руб");
            }
        }
        if (moneyAmaunt >= marsPrice) {
            System.out.println("Вы можете купить марс");
            isCanBuy = true;
        }
        if (moneyAmaunt >= snikersPrice) {
            System.out.println("Вы можете купить марс");
            isCanBuy =true;
        }
        if (moneyAmaunt >= waterPrice) {
            System.out.println("Вы можете купить Воду");
            isCanBuy =true;
        }
        if (isCanBuy == false) {
            System.out.println("У вас не хваетает денег");
        }
    }
}
