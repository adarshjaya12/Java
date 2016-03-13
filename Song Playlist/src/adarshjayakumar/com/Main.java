package adarshjayakumar.com;

import java.util.*;

public class Main {

    private static ArrayList<Albums> albums = new ArrayList<Albums>();

    public static void main(String[] args) {

        Albums justinBeiber = new Albums("Purpose","Justin Beiber");
        justinBeiber.addSongs("What Do you mean?",3.25);
        justinBeiber.addSongs("Sorry",3.20);
        justinBeiber.addSongs("Love Yourself",3.53);
        justinBeiber.addSongs("Mark my Words",2.14);
        albums.add(justinBeiber);
        Albums linkinPark = new Albums("meteora","Linkin Park");
        linkinPark.addSongs("Breaking the habbit",3.56);
        linkinPark.addSongs("Faint",3.36);
        linkinPark.addSongs("Somewhere I belong",4.16);
        linkinPark.addSongs("Dont Stay",3.56);
        albums.add(linkinPark);

        LinkedList<Song> playlist = new LinkedList<Song>();
        albums.get(0).addToPlaylist("Sorry",playlist);
        albums.get(1).addToPlaylist("Faint",playlist);
        albums.get(1).addToPlaylist("Somewhere I belong",playlist);
        albums.get(1).addToPlaylist("What I have done",playlist);
        albums.get(0).addToPlaylist(4,playlist);
        playList(playlist);

    }
    public static void playList(LinkedList<Song> myPlaylist)
    {
        Scanner scanner = new Scanner(System.in);
        boolean quit = true;
        boolean forward = true;
        ListIterator<Song> listIterator = myPlaylist.listIterator();
        if(myPlaylist.size() == 0)
        {
            System.out.println("There is nothing in the playlist");
            return;
        }
    printMenu();
        while(quit)
        {
            System.out.println("Enter value for the Menu");
            int uservalue = scanner.nextInt();
            scanner.nextLine();
            switch (uservalue)
            {
                case 0:
                    System.out.println("Playlist Complete");
                    quit = false;
                    break;
                case 1:
                    if(!forward)
                    {
                        if(listIterator.hasNext())
                        {
                            listIterator.next();
                            forward = true;
                        }
                    }
                    if(listIterator.hasNext())
                    {
                        System.out.println("Now Playing "+listIterator.next().getTitle());
                        break;
                    }
                    else
                    {
                        System.out.println(" We have reached the end of the playlist");
                        forward = false;
                        break;
                    }
                case 2:
                    if(forward)
                    {
                        if(listIterator.hasPrevious())
                        {
                            listIterator.previous();
                            forward = false;
                        }
                    }
                    if(listIterator.hasPrevious())
                    {
                        System.out.println("Now playing previous "+listIterator.previous().getTitle());
                        break;
                    }
                    else
                    {
                        System.out.println("You have reached the first song in the list");
                        forward = true;
                        break;
                    }
                case 3:
                    if(forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().getTitle());
                            break;
                        } else {
                            System.out.println("We are at the start of the List");
                            break;
                        }
                    }
                    else{
                        if(listIterator.hasNext())
                        {
                            System.out.println("Now replaying "+listIterator.next().getTitle());
                            forward = true;
                            break;
                        }
                        else
                        {
                            System.out.println("we have reached the end of the list");
                            break;
                        }
                    }


                case 4:
                    printList(myPlaylist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(myPlaylist.size() >0)
                    {
                        listIterator.remove();
                        if(listIterator.hasNext())
                            System.out.println("Now Playing "+listIterator.next());
                        else if(listIterator.hasPrevious())
                            System.out.println("Now playing "+listIterator.previous());
                    }
                    else
                        System.out.println("No more songs to delete");
                    break;
            }

        }
    }

    private static void printMenu()
    {
        System.out.println("Playlist Menu \n Choose one");
        System.out.println("----------------------------");
        System.out.println("0 - Quit");
        System.out.println("1 - Play next Song");
        System.out.println("2 - Play previous Song");
        System.out.println("3 - toReplay the current song");
        System.out.println("4 - Display Song List");
        System.out.println("5 - print menu");
        System.out.println("6 - Delete Current song");
    }

    private static void printList(LinkedList<Song> myPlaylist)
    {
        System.out.println("Playlist Song Details : ");
        System.out.println("========================");
        for(int i=0;i <myPlaylist.size();i++)
        {
            System.out.println("Song : "+myPlaylist.get(i).getTitle()+" Duration : "+
                    myPlaylist.get(i).getDuration());
        }
        System.out.println("========================");
//        ListIterator<Song> mylist = myPlaylist.listIterator();
//        Iterator<Song> mylist = myPlaylist.iterator();
//        while(mylist.hasNext())
//            System.out.println("Song Name :"+mylist.next().getTitle()+" Duration :"+
//                    mylist.v);

    }
}
