
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int giftVal = Integer.valueOf(scan.nextLine());

        if (giftVal >= 5000 && giftVal < 25000) {
            double tax = (100 + (giftVal - 5000) * .08);
            System.out.println("Tax: " + tax);
        }
        if (giftVal >= 25000 && giftVal < 55000) {
            double tax = (1700 + (giftVal - 25000) * .1);
            System.out.println("Tax: " + tax);
        }
        if (giftVal >= 55000 && giftVal < 200000) {
            double tax = (4700 + (giftVal - 55000) * .12);
            System.out.println("Tax: " + tax);
        }
        if (giftVal >= 200000 && giftVal < 1000000) {
            double tax = (22100 + (giftVal - 200000) * .15);
            System.out.println("Tax: " + tax);
        }
        if (giftVal >= 1000000) {
            double tax = (142100 + (giftVal - 1000000) * .17);
            System.out.println("Tax: " + tax);
        } 
        if (giftVal < 5000){
            System.out.println("No tax!");
        }
    }
}
