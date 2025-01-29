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
    private int duration; //duration in seconds
    private int releaseYear;
    private boolean liked;

    /**
     * Constructor-- what information needs to be given to make a Song?
     * In order to make the song, we need the title, the artist, the duration(in mins).
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     * Liked songs have a boolean to determine the status
     */
    public Song(String title, String artist, int releaseYear, int songLength)
    {
        this.title = title;
        this.artist = artist;
        this.duration = songLength;
        this.releaseYear = releaseYear;
        liked = false;
    }


    /**
     * Method getName gets the name of the song
     * @return the song's title
     */
    public String getName()
    {
        return title;
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
        return duration;
    }

    /**
     * Method likedOrNot method tells us if the song is liked or not
     */
    public boolean likedOrNot()
    {
        return liked;
    }

    public void setLiked(boolean state)
    {
        liked = state;
    }
    /**
     * Method toString allows for all the information about the song to be returned
     * @return all the information about the song
     */
    public String toString()
    {
        int minutes = duration / 60;
        int seconds = duration % 60;
        
        return "'" + title + "'" + " by " + artist + " (" + minutes + ":" + seconds + ")";

        // return "Song Info:" + "\n Title: " + title + 
        //     "\n Artist: " + artist + 
        //     "\n Release Year: " + releaseYear +
        //     "\n Duration: " + duration +
        //     "\n Liked: " + (liked? "Yes" : "No");
    }
}
