package listdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class SongService {

	public void start() {
		//getSongList from songlist.txt file
		List<Song> songs = getSongs();
		//display song list
		System.out.println("-------Before Sorting---------");
		for (Song song : songs) {
			System.out.println(song);
		}
		//sorting the songs based on title
		//Collections.sort(songs);
		TreeSet<Song> sortedSet = new TreeSet<>(songs);
		System.out.println("-------After Sorting---------");
		for (Song song : sortedSet) {
			System.out.println(song);
		}
		
	}

	private List<Song> getSongs() {
		//Read songlist.txt file and create song list
		List<Song> songList =  new ArrayList<>();
		try {
			File file=new File("songlist.txt");
			BufferedReader reader =  new BufferedReader(new FileReader(file));
			String line=null;
			while((line=reader.readLine())!=null) {
				String[] tokens = line.split("/");
				songList.add(new Song(tokens[0], tokens[1], tokens[2], tokens[3]));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return songList;
	}

}
