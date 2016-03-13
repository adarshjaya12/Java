package adarshjayakumar.com;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by adarsh on 3/13/2016.
 */
public class Albums {

    private String albumName;
    private String artist;
    private ArrayList<Song> albumSongs;

    public Albums(String albumName, String artist ) {
        this.albumName = albumName;
        this.artist = artist;
        albumSongs = new ArrayList<Song>();
    }

    public void addSongs(String songName , double songDuration)
    {
        if(findSong(songName) == null)
        {
            this.albumSongs.add(new Song(songName,songDuration));

        }
        else
        {
            System.out.println("Song already in the Album");
        }
    }

    private Song findSong(String songName)
    {
        for(Song checkedSong : this.albumSongs)
        {
            if(checkedSong.getTitle().equals(songName))
                return checkedSong;
        }
        return null;
    }

    public boolean addToPlaylist(int trackNumber , LinkedList<Song> playList)
    {
        int index = trackNumber -1;
        if((index >0) && (index <= this.albumSongs.size()))
        {
        playList.add(this.albumSongs.get(index));
        return true;
        }
        System.out.println("This album has no tracks "+trackNumber);
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playList)
    {
        Song song = findSong(title);
        if(song != null)
        {
            playList.add(song);
            return true;
        }
        System.out.println("The song " +title+ " is not in this album");
        return false;

    }

    public String getAlbumName() {
        return this.albumName;
    }

    public ArrayList<Song> getAlbumSongs() {
        return this.albumSongs;
    }
}
