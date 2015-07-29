package com.hackbulgaria.programming51.week4;

import com.hackbulgaria.programming51.week4.Song;
import com.hackbulgaria.programming51.week3.Vector;

public class MusicOrganiser {
	Vector<Song> songs = new Vector<Song>();

	public void addSong(Song s) {
		songs.add(s);
	}

	public int getCount() {
		return songs.size();
	}

	public Vector<String> getAlbums() {
		Vector<String> albums = new Vector<String>();
		for (int i = 0; i < getCount(); i++) {
			if (albums.contains(songs.get(i).getAlbum())) {
				continue;
			}
			albums.add(songs.get(i).getAlbum());
		}
		return albums;
	}

	public int getAlbumsCount() {
		return getAlbums().size();
	}

	public Vector<Song> getAlbumSongs(String albumName) {
		Vector<Song> albumSongs = new Vector<Song>();
		for (int i = 0; i < getCount(); i++) {
			if (songs.get(i).getAlbum().equals(albumName)) {
				albumSongs.add(songs.get(i));
			}
		}

		return albumSongs;
	}

	public Vector<String> getAlbumsAndSongs(String albumName) {
		Vector<String> result = new Vector<String>();
		for (int i = 0; i < getAlbumsCount(); i++) {
			String add = getAlbums().get(i) + " (" + getAlbumsCount() + ")";
			result.add(add);
		}
		return result;
	}

	public String toString() {
		return songs.toString();
	}

	public static void main(String[] args) {

	}

}
