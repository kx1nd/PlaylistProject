/**
 * Tester for PLaylist.java class - Should follow the guidelines of the project in the given rubric on the crashwhite.com website
 * Note that there's no need for a Scanner in this project-- all of the playlist can be 'hardcoded' into main.
 * @ William Son & Kelland Hong
 * @ 2025-01-28
 */

 import java.util.ArrayList;

public class PlaylistTester {
    public static void main(String[] args) {
        System.out.println("Initializing a Playlist...\n");
        //New playlist for the main method 

        Playlist myPlaylist = new Playlist();
        
        System.out.println("Adding songs to the Playlist...\n");
        /**
         * Adding songs: APT by Rosé & Bruno Mars, Popular by Ariana Grande, & In The Stars by Benson Boone
         */

        myPlaylist.addSong(new Song("APT", "Rosé & Bruno Mars", 2024, 180));
        myPlaylist.addSong(new Song("Popular", "The Weeknd & Madonna", 2023, 210));
        myPlaylist.addSong(new Song("In the Stars", "Benson Boone", 2022, 195));
        myPlaylist.addSong(new Song("Unholy", "Sam Smith & Kim Petras", 2022, 185));



        System.out.println("Printing the songs...\n");
        //Print out all the songs in the playlist to verify it's working correctly
        myPlaylist.allSongs();


        System.out.println("\nLiking 'APT' and 'Popular'...\n");
        //Once your songs are 'liked', this should be reflected in the next printout
        
        myPlaylist.likeSong("APT");
        myPlaylist.likeSong("Popular");


        System.out.println("Printing the songs...\n");

        myPlaylist.allSongs();

        System.out.println("\nRemoving 'In the Stars' ...\n");
        
        myPlaylist.removeSong("In the Stars");

        System.out.println("Printing the songs...\n");

        myPlaylist.allSongs();

        System.out.println("\nPrinting only the liked songs...\n");
        //Your Playlist should be able to do this without looping while in main!

       myPlaylist.likedSongs();

        System.out.println("\nPrinting the total duration of all songs...\n");
        //Note that the format should look something like minutes:seconds

        int totalDuration = myPlaylist.getTotalDuration();
        int minutes = totalDuration / 60;
        int seconds = totalDuration % 60;
        System.out.println("Total Duration: " + minutes + " minutes " + seconds + " seconds");

        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        //This should be doable with a single method call

        myPlaylist.removeUnlikedSongs();

        System.out.println("Printing all songs...\n");
        //This should now look like only the liked songs list from before

        myPlaylist.allSongs();

        System.out.println("\nPlaylist testing done!");
    }
}
