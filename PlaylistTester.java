/**
 * Tester for PLaylist.java class - Should follow the guidelines of the project in the given rubric on the crashwhite.com website
 * Note that there's no need for a Scanner in this project-- all of the playlist can be 'hardcoded' into main.
 * @ William Son & Kelland Hong
 * @ 2025-01-28
 */
public class PlaylistTester {
    public static void main(String[] args) {
        System.out.println("Initializing a Playlist...\n");
        //New playlist for the main method 

        Playlist myPlaylist = new Playlist();
        
        System.out.println("Adding songs to the Playlist...\n");
        /**
         * Adding songs: APT by Rosé & Bruno Mars, 
         */



        System.out.println("Printing the songs...\n");
        //Print out all the songs in the playlist to verify it's working correctly
        myPlaylist.allSongs();


        System.out.println("\nLiking the songs in position X, Y, Z, etc....\n");
        //Once your songs are 'liked', this should be reflected in the next printout
        
        myPlaylist.likeSong("APT");
        myPlaylist.likeSong("Popular");


        System.out.println("Printing the songs...\n");

        myPlaylist.allSongs();

        System.out.println("\nRemoving the song in position A, B, C, etc...\n");
        
        myPlaylist.removeSong("In the Stars");

        System.out.println("Printing the songs...\n");

        myPlaylist.allSongs();

        System.out.println("\nPrinting only the liked songs...\n");
        //Your Playlist should be able to do this without looping while in main!

       myPlaylist.likedSongs();

        System.out.println("\nPrinting the total duration of all songs...\n");
        //Note that the format should look something like minutes:seconds


        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        //This should be doable with a single method call


        System.out.println("Printing all songs...\n");
        //This should now look like only the liked songs list from before
    }
}
