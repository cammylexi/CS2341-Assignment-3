import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        RedBlackBST<String, Product> tree = new RedBlackBST<>();

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\cammc\\IdeaProjects\\Assignment 3\\lib\\amazon-product-data.csv"))) {
            String line = br.readLine();

            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");

                // Ensure that there are at least 3 fields (id, name, and category)
                if (fields.length >= 3) {
                    String id = fields[0];
                    String name = fields[1].replace("\"", "");  // Remove quotes around the name if any
                    String category = fields[2];

                    String price = ""; // Initialize price as empty in case it's missing

                    // Check if price field exists
                    if (fields.length > 3) {
                        price = fields[3].replace("$", "").trim();
                    }

                    Product product = new Product(id, name, category, price);
                    insertionCheck1(tree, product);

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //User inputs product ID to search for the product
        boolean isSearching = true;

        while(isSearching) {
            System.out.print("Enter the Product ID to search (or type 'exit' to quit): ");
            String input = scan.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                isSearching = false;
                break;
            }

            searchAndDisplay(tree, input);

            boolean inputCheck = true;
            while(inputCheck) {
                System.out.println("Do you want to search for another product? (Type:[Yes or No])");
                String answer = scan.nextLine().trim();

                if (answer.toLowerCase().equals("no")) {
                    isSearching = false;
                    break;

                } else if (!answer.toLowerCase().equals("yes")) {
                    System.out.println("Invalid input, try again.");

                }
                else{
                    break;
                }

            }
            System.out.println();

        }

        // Hardcode insertion of 2 items, one has to be a duplicate

        System.out.println("Insertion Results: ");
        Product product1 = new Product("123c456a789m0","Classy Black Sprinkling Dress", "Clothes | Women's Clothes | Dresses | Black Dresses","$45.67");
        insertionCheck2(tree,product1);

        Product product2 = new Product("82c86a4d24dce5e14303033d7b658b78", "LEGO Minecraft Creeper BigFig and Ocelot Characters 21156 Buildable Toy Minecraft Figure Gift Set for Play and Decoration, New 2020 (184 Pieces)","Toys & Games | Building Toys | Building Sets","$14.99");
        insertionCheck2(tree,product2);
    }

    private static void searchAndDisplay(RedBlackBST<String, Product> tree, String productId) {
        Product product = tree.get(productId);

        if (product != null) {
            System.out.println("Product found! Here are the details:");
            System.out.println("   - ID: " + product.getId());
            System.out.println("   - Name: " + product.getName());
            System.out.println("   - Category: " + product.getCategory());
            System.out.println("   - Price: $" + product.getPrice());
            System.out.println();
        } else {
            System.out.println("No product found with the specified ID: " + productId);
            System.out.println();
        }
    }

    private static void insertionCheck1(RedBlackBST<String, Product> tree, Product product ){

        if (tree.contains(product.getId())) {
            System.out.println("Insertion Error: A product with ID " + product.getId() + " already exists in the tree.");
        } else {
            tree.put(product.getId(),product);
        }

    }
    private static void insertionCheck2(RedBlackBST<String, Product> tree, Product product ){

        if (tree.contains(product.getId())) {
            System.out.println("Insertion Error: A product with ID " + product.getId() + " already exists in the tree.");
        } else {
            tree.put(product.getId(),product);
            System.out.println("Successfully Inserted: A product with ID " + product.getId());
        }

    }
}