import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 * @author William Son & Kelland Hong
 * @version 2025-01-27
 */

import java.util.ArrayList;

public class Playlist {
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */
    
    private ArrayList <Song> p;

     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */
    public Playlist() 
    {
        p = new ArrayList<Song>();
    }

    /**
     * Adding a song
     */
    public void addSong(Song newSong)
    {
        p.add(newSong);
    }
        
    /**
     * Removing a specific song
     * @param songName the song to be removed
     */
    public void removeSong (String title)
    {
        for (int i = 0; i < p.size(); i++) 
        {
            if (p.get(i).getName().equalsIgnoreCase(title)) 
            {
                p.remove(i);
            }
        }
    }
    /**
     * "Liking" a song
     */
    public void likeSong (String title) 
    {
        for (Song p : p) 
        {
            if (p.getName().equalsIgnoreCase(title)) 
            {
                p.setLiked(true);
            }
        }
    }
    
      /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a song
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */
}
