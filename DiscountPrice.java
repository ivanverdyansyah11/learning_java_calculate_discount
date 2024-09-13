import java.util.Scanner;

public class DiscountPrice {
    public static void main(String[] args) {
        char codePrice;
        int articlePrice;
        int discountPrice = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Article price: ");
        articlePrice = input.nextInt();

        System.out.print("Choose an code price: ");
        codePrice = input.next().charAt(0);

        switch (codePrice) {
            case 'H':
                discountPrice = 10;
                break;

            case 'F':
                discountPrice = 20;
                break;

            case 'T':
                discountPrice = 30;
                break;

            case 'Q':
                discountPrice = 40;
                break;

            case 'Z':
                discountPrice = 0;
                break;

            default:
                System.out.println("Invalid input code price!");
                break;
        }

        System.out.println("Your starting price: " + articlePrice);
        System.out.println("Your final price: " + articlePrice / 100 * discountPrice);

        input.close();
    }
}
