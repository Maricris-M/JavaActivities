package L16Activity;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Playlist playlist = new Playlist();
		
		System.out.println("Welcome to Spotify");
		
		while (true) {
			System.out.println("\nChoose an option:"
					+ "\n1. Add a song to playlist"
					+ "\n2. Display the playlist"
					+ "\n3. Remove a song from the playlist"
					+ "\n4. Play next song"
					+ "\n5. Exit");
			System.out.print("\nEnter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {
			case 1:
				System.out.print("Enter song title: ");
				String title = scanner.nextLine();
				System.out.print("Enter artist name: ");
				String artist = scanner.nextLine();
				playlist.addSong(title, artist);
				break;
			case 2:
				playlist.displayPlaylist();
				break;
			case 3:
				System.out.print("Enter index of song to remove: ");
				title = scanner.nextLine();
				playlist.removeSong(title);
				break;
			case 4:
				playlist.displayCurrentSong();
				playlist.displayNextSong();
				break;
			case 5:
				System.out.println("Exiting playlist.");
				scanner.close();
				System.exit(0);
			default:
				System.err.println("Invalid choice. Please try again.");
			}	
		}

	}

}
