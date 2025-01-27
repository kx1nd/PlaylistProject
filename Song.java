/**
 * File for a Song class to be used in the Playlist Project
 * @William Son
 * @2024-01-26
 */
public class Song 
{
    //Fields-- what information do we want each Song to store?
    private String title;
    private String artist;
    private int duration;
    private boolean liked;

    /**
     * Constructor-- what information needs to be given to make a Song?
     * In order to make the song, we need the title, the artist, the duration(in secs).
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     * Liked songs have a boolean to determine the status
     */
    public Song(String songName, int songLength)
    {
        title = songName;
        this.artist = artist;
        duration = songLength;
        this.liked = liked;
    }


    /**
     * Method getName gets the name of the song
     * @return the song's title
     */
    public String getName()
    {
        return songName;
    }

    /**
     * Method getArtist return the song's artist
     * @return the artist's name
     */
    public String getArtist()
    { 
        return artist;
    }

    /**
     * Method getDuration returns the length of the song
     * @return the song's length
     */
    public int getDuration()
    {
        songLength = songLength / 60;
        return songLength;
    }

    /**
     * Method likedOrNot method tells us if the song is liked or not
     */
    public boolean likedOrNot()
    {
        if (liked)
        {
            liked = true;
        }
        else 
        {
            liked = false;
        }
    }
    
     /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */


}
