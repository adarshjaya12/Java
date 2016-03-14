package adarshjayakumar.com;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by adarsh on 3/13/2016.
 */
public class Albums {

    private String albumName;
    private String artist;
    private SongList songs;

    public Albums(String albumName, String artist ) {
        this.albumName = albumName;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSongs(String songName , double songDuration)
    {
        return this.songs.add(new Song(songName,songDuration));
    }



    public boolean addToPlaylist(String title, LinkedList<Song> playList)
    {
        Song checkedSong = this.songs.findSongs(title);
        if(checkedSong != null)
        {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The Song "+title+" is not in this album");
        return false;

    }

    public class SongList
    {
        private ArrayList<Song> albumSongs;

        public SongList() {
            this.albumSongs =  new ArrayList<Song>();
        }


        public boolean add(Song song)
        {
            if(albumSongs.contains(song))
                return false;
            this.albumSongs.add(song);
            return true;
        }


        private Song findSongs(String songName)
        {
            Song myExsitingSong;
            for(int i=0 ; i<albumSongs.size();i++)
            {
                if(albumSongs.get(i).getTitle() == songName)
                {
                    myExsitingSong = albumSongs.get(i);
                    return myExsitingSong;
                }
            }
            return null;
        }
    }

}
