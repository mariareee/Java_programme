import java.util.Scanner;

/*Create a program that will get a string Name, an int nrOfPizzas and
* a double price.And will print the reciept:
*       Restaurant Java
*       Thank you {name} for visiting our restaurant.
*        You've ordered {nrOfPizzas} pizzas
*        With total price of: {price}.
*        Price with 20% discount*/
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.next();
        int nrOfPizzas = scan.nextInt();;
        double price = scan.nextDouble();
        double priceWDisc = price * 0.8; //20% off

        String reciept =
                String.format(
                "Restaurant Java\n" +
                "                Thank you %s for visiting our restaurant.\n" +
                "                You've ordered %d pizzas\n" +
                "                With total price of: %.2f . \n" +
                "                Price with 20%% discount: %.2f",name, nrOfPizzas, price, priceWDisc); //input %% in order to have -> %

        System.out.println(reciept);
    }
}