import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placeToVisit = new LinkedList<String>();
        addInorder(placeToVisit, "Sydney");
        addInorder(placeToVisit, "Melbourne");
        addInorder(placeToVisit, "Brisbane");
        addInorder(placeToVisit, "Perth");
        addInorder(placeToVisit, "Canberra");
        addInorder(placeToVisit, "Adelaide");
        addInorder(placeToVisit, "Darwin");
        printList(placeToVisit);
        addInorder(placeToVisit, "Alice Springs");
        addInorder(placeToVisit, "Darwin");
        printList(placeToVisit);
        visit(placeToVisit);

       /* placeToVisit.add("Sydney");
        placeToVisit.add("Melboure");
        placeToVisit.add("Brisbane");
        placeToVisit.add("Perth");
        placeToVisit.add("Canberra");
        placeToVisit.add("Adelaide");
        placeToVisit.add("Darwin");

        printList(placeToVisit);

        placeToVisit.add(1, "Alice Strings");
        printList(placeToVisit);
        placeToVisit.remove(4);
        printList(placeToVisit);*/
    }
    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("======================");
    }

    private static boolean addInorder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison ==0){
                //equal do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if(comparison>0){
                // new city should appear this one
                //Brisbane -> Adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if(comparison <0) {
                // move on Next City
            }

        }

            stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();;

        if(cities.isEmpty()){
            System.out.println("No cities in the itenary");
            return;
        }
        else{
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }
        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Holiday over");
                    quit = true;
                    break;

                case 1:
                    if(!goingForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                         }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now Visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward=false;
                    }
                    break;

                case 2:
                    if(goingForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are the start on the list");
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Availale actions: \npress ");
        System.out.println("0 - to quit\n" +
                "1 - go to next City\n" +
                "2 - go to previous city\n" +
                "3 - print menu options");
    }
}
