package setdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class SongService {

	public void start() {
		// getSongList from songlist.txt file
		List<Song> songs = getSongs();
		// display song list
		System.out.println("-------Before Sorting---------");
		for (Song song : songs) {
			System.out.println(song);
		}
		//Collections.sort(songs, new SongAuthorComparator());
		Collections.sort(songs, (s1, s2)-> s1.getArtist().compareTo(s2.getArtist())); // Java 8 
		
		System.out.println("-------After Sorting Based on Artist---------");
		for (Song song : songs) {
			System.out.println(song);
		}
		
		System.out.println("-------After Removing Duplicate---------");
		//No Duplicate allowed, unordered, unsorted
		HashSet<Song> songSet =  new HashSet<>();
		songSet.addAll(songs);
		for (Song song : songSet) {
			System.out.println(song);
		}

	}

	private List<Song> getSongs() {
		// Read songlist.txt file and create song list
		List<Song> songList = new ArrayList<>();
		try {
			File file = new File("songlist.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = reader.readLine()) != null) {
				String[] tokens = line.split("/");
				songList.add(new Song(tokens[0], tokens[1], tokens[2], tokens[3]));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return songList;
	}

}
