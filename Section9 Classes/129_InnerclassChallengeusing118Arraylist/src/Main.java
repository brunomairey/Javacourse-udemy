import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();


    public static void main(String[] args) {


        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.52);
        album.addSong("Hold on ", 4.45);
        album.addSong("You can't do it right", 4.67);
        album.addSong("The gypsy", 4.37);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 4.22);
        album.addSong("Evil walks", 4.98);
        album.addSong("Breaking the rules", 3.74);
        album.addSong("Snowballed", 4.51);
        album.addSong("C.O.D.", 6.61);
        album.addSong("For those about to rock", 5.44);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("The gypsy", playList);
        albums.get(0).addToPlayList("Macarena", playList);
        albums.get(0).addToPlayList(5, playList);
        albums.get(1).addToPlayList(7, playList);
        albums.get(1).addToPlayList(5, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList);

        play(playList);

    }

    private static void play(LinkedList<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playlist.listIterator();
        if(playlist.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }
        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;

                case 1:
                    if(!forward){
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("we have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    }
                    else {
                        System.out.println("we have reached the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        }
                        else {
                            System.out.println("We are at the start of the list");
                        }
                    }
                    else {
                        if(listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward=true;
                        }
                        else {
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                   printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playlist.size()>0){
                        listIterator.remove();
                        if(listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        }
                        else if(listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }
    private static void printMenu() {
        System.out.println("Available actions : \n press");
        System.out.println("0 - to quit:\n" +
                "1 - to play next Song\n " +
                "2 - to play previous song\n" +
                "3 - to replay the current song \n" +
                "4- list songs in the playlist \n" +
                "5 - print available actions.\n"+
                "6 - Delete current song from playlist");

    }

    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("======================");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("======================");
    }



}


