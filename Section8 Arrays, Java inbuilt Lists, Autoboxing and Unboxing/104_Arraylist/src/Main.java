import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice=0;
        printInstructions();
        while ((!quit)){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit=true;
                    break;


            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress");
        System.out.println("\t 0 _ To print choice options.");
        System.out.println("\t 1 _ To print the list of grocery items");
        System.out.println("\t 2 _ To add an item to the list");
        System.out.println("\t 3 _ To modify an item in the list");
        System.out.println("\t 4 _ To remove an item from the list");
        System.out.println("\t 5 _ To search for an item in the list");
        System.out.println("\t 6 _ To quit the application.");
    }

    public static void  addItem() {
        System.out.println("please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.println("Current item name: ");
        String itemNo = scanner.nextLine();
        System.out.println("Enter new item:");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);
    }
    public static void  removeItem() {
        System.out.println("Enter item name: ");
        String itemNo = scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);

    }

    public static void searchForItem() {
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.onFile(searchItem)){
            System.out.println("Found " + searchItem + " in our grocery list");
        } else {
            System.out.println(searchItem + " is not in the grocery list");
        }
    }
}
