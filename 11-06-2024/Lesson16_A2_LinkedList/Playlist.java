package L16Activity;

import java.util.LinkedList;

public class Playlist {
	private LinkedList<Song> playlist = new LinkedList<>();

    public void addSong(String title, String artist) {
        Song mySong = new Song(title, artist);
        playlist.add(mySong);
        System.out.println("Song added to the playlist!");
    }
    
    public void displayPlaylist() {        
        if (!(playlist.isEmpty())) { 
            for (Song mySong : playlist) {
                System.out.println(mySong.toString());
            }
        } else {
        	System.err.println("Playlist is empty.");
        }
    }

    public void removeSong(String title) {
        boolean isRemoved = false;
        for (Song song : playlist) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                playlist.remove(song);
                isRemoved = true;
                break;
            }
        }

        if (isRemoved) {
            System.out.println("The song " + title + " is removed.");
        } else {
            System.err.println("The song " + title + " does not exist.");
        }
    }

    public void displayCurrentSong() {
        if (playlist.size() < 1) {
            System.out.println("No current song.");
        } else {
            System.out.println("--- Current song ---" + playlist.getFirst());
        }
    }

    public void displayNextSong() {
        if (playlist.size() > 1) {
        	System.out.println("--- Next song ---" + playlist.get(1));
        } else {
        	System.out.println("No more next song.");
        }
    }
}
