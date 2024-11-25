package Productv4;

import ie.atu.productv2.Software;
import ie.atu.productv2.SoftwareDB;

import java.util.Scanner;

public class MusicApp
{
    public static void main(String[] args) {
        // display a welcome message
        System.out.println("Welcome to the Software Viewer");
        System.out.println();

        // perform 1 or more selections
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter Product code: ");
            String productCode = sc.nextLine();  // read the Software code

            // get the Software object
            Product yourProduct = Product.getCode(productCode);

            // display the output
            System.out.println();
            if (yourProduct != null) {
                System.out.println("Description: " + yourProduct.toString());
                System.out.println("Price:       " + yourProduct.getPriceFormatted());
            } else {
                System.out.println("No Software matches this Software code.");
            }

            System.out.println();
            System.out.println("Software count: " + Software.getCount() + "\n");

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        sc.close();
    }
}
