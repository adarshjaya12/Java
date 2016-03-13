package adarshjayakumar.com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

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
        ListIterator<Song> listIterator = myPlaylist.listIterator();
        if(myPlaylist.size() == 0)
        {
            System.out.println("There is nothing in the playlist");
            return;
        }
        else if(myPlaylist.size() > 0)
        {
            System.out.println("Now playing "+listIterator.next().toString());
        }
    }







}
