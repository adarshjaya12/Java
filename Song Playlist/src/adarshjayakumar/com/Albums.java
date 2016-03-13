package adarshjayakumar.com;

import java.util.ArrayList;

/**
 * Created by adarsh on 3/13/2016.
 */
public class Albums {

    private String albumName;
    private ArrayList<Song> albumSongs;

    public Albums(String albumName) {
        this.albumName = albumName;
        albumSongs = new ArrayList<Song>();
    }

    
}
