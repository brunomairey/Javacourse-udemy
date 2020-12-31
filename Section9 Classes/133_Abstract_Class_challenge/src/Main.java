public class Main {
    public static void main(String[] args) {


        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());

      //String stringData = "5 6 2 8 3 4 9";
        String stringData = "Belfort Limoges Vierzon Vesoul Montélimar Villeneuve-sur-Franche Villefranche-de-Rouerges";
        String[] data = stringData.split(" ");

        for (String s : data) {
            tree.addItem(new Node(s));
        }
        tree.traverse(tree.getRoot());
//
//        list.traverse(list.getRoot());

       // MyLinkedList list = new MyLinkedList(null);
     //   list.traverse(list.getRoot());
//"Belfort Limoges Vierzon Vesoul Montélimar Villeneuve-sur-Franche - Villefranche-de-Rouerges"
//        String stringData = "5 6 2 8 3 4 9";
//
//        String[] data = stringData.split(" ");
//        for (String s : data) {
//            list.addItem(new Node(s));
//        }
//
//        list.traverse(list.getRoot());
//        list.removeITem(new Node("3"));
//        list.traverse(list.getRoot());


    }
}
